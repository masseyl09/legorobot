package legorobot;

import java.util.Random;

import lejos.hardware.BrickFinder;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

import lejos.hardware.Sound;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class Move {

	private SensorModes color_sensor;
	private SensorModes infrared_sensor;
	
	// Most likely centimeters (5-50)
	private SampleProvider ir_distance;
	float[] ir_sample;
	
	/* Color ID outputs (Not sure of these values yet):
	 * 0 - No color
	 * 1 - Black
	 * 2 - Blue
	 * 3 - Green
	 * 4 - Yellow
	 * 5 - Red
	 * 6 - White
	 * 7 - Brown
	 */
	private SampleProvider color_idMode;
	
	// Motor assignments based off looking at LEA face on
	private RegulatedMotor motor_left;
	private RegulatedMotor motor_right;
	private RegulatedMotor motor_arms;
	
	// In degrees per second per second
	private double acceleration = 60;
	
	// In degrees per second
	private double speed = 180;
	
	// For loop logic
	private boolean am_moving = false;

	public Move() {
		
		// Motors
		motor_left = new EV3LargeRegulatedMotor(BrickFinder.getDefault().getPort("A"));
		motor_right = new EV3LargeRegulatedMotor(BrickFinder.getDefault().getPort("C"));
		motor_arms = new EV3MediumRegulatedMotor(BrickFinder.getDefault().getPort("B"));
		
		// Sensors
		//Port port3 = LocalEV3.get().getPort("S3");
		Port port4 = LocalEV3.get().getPort("S4");
		
		//color_sensor = new EV3ColorSensor(port3);
		infrared_sensor = new EV3IRSensor(port4);
		
		ir_distance = infrared_sensor.getMode("Distance");
		//color_idMode = color_sensor.getMode("ColorID");
		
		ir_sample = new float[ir_distance.sampleSize()];
	}

	private void avoid() {
		
		// Back up slightly to ensure turn can be completed without accidentally hitting the obstacle
		motor_left.startSynchronization();
		motor_left.rotate(180*3); // 1.5 reverse wheel turn
		motor_right.rotate(180*3);
		motor_left.endSynchronization();
		
		Delay.msDelay(500);
		
		// Turn a random amount of degrees (between 120 and 290 so we don't head right back into the obstacle)
		Random random = new Random();
		int random_degrees = random.nextInt(270 - 140 + 1) + 140;
		
		motor_left.startSynchronization();
		motor_left.rotate(-random_degrees); // One wheel goes backwards so that the robot turns in place
		motor_right.rotate(random_degrees);
		motor_left.endSynchronization();
		
		Delay.msDelay(500);
		startMoving(0); // Move arms for testing
		
		// Start moving again
		startMoving(1);
	}

	private void detect() {
		
		do {
			// Look for objects by distance (note that she won't recognize black very well)
			ir_distance.fetchSample(ir_sample, 0);
		} while (ir_sample[0] > 60);
		
		// Upon detection of an object, stop movement
		motor_left.startSynchronization();
		motor_left.stop();
		motor_right.stop();
		motor_left.endSynchronization();
		
		Delay.msDelay(500);
		
		// Run avoid
		Sound.twoBeeps();
		avoid();
	}

	/**
	 * 
	 * @param move - integer value 0 for arms, 1 for feet
	 */
	public void startMoving(int move) {
		
		if (move == 1) {
			am_moving = true;

			// Move forward to start
			motor_left.synchronizeWith(new RegulatedMotor[] {motor_right});
			motor_left.startSynchronization();
			//motor_left.forward();
			//motor_right.forward();
			motor_left.backward(); // It's backwards now for some reason (backward goes forward and vice versa).......
			motor_right.backward();
			motor_left.endSynchronization();

			// Start detection "algorithm"
			detect();
		}
		
		else if (move == 0) {
			// Move the arms up
			motor_arms.rotate(720);
			Sound.beep();
			
			// Pause for 5 seconds
			Delay.msDelay(1000*5);
			
			// Move the arms back down
			motor_arms.rotate(-720);
		}
	}
	
	public void stopMoving() {
		motor_left.synchronizeWith(new RegulatedMotor[] {motor_right});
		motor_left.startSynchronization();
		motor_left.stop();
		motor_right.stop();
		motor_left.endSynchronization();
		am_moving = false;
	}
	
	public boolean isRobotMoving() {
		if (motor_left.isMoving() || motor_right.isMoving() || am_moving) {
			return true;
		}
		return false;
	}
	
	/* Getters and Setters */
	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}
	
	public double getAcceleration() {
		return acceleration;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public double getSpeed() {
		return speed;
	}
}