package legorobot;

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
	
	/* Color ID outputs:
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


	public Move() {
		// Motors
		motor_left = new EV3LargeRegulatedMotor(BrickFinder.getDefault().getPort("A"));
		motor_right = new EV3LargeRegulatedMotor(BrickFinder.getDefault().getPort("C"));
		//motor_arms = new EV3MediumRegulatedMotor(BrickFinder.getDefault().getPort("B"));
		
		// Sensors
		//Port port3 = LocalEV3.get().getPort("S3");
		Port port4 = LocalEV3.get().getPort("S4");
		
		//color_sensor = new EV3ColorSensor(port3);
		infrared_sensor = new EV3IRSensor(port4);
		
		ir_distance = infrared_sensor.getMode("Distance");
		//color_idMode = color_sensor.getMode("ColorID");
		
		ir_sample = new float[ir_distance.sampleSize()];
	}

	public void avoid(){
		
		// Turn a random amount of degrees
		
		// Move again

	}

	public void detect(){
		
		// Stop movement
		motor_left.startSynchronization();
		motor_left.stop();
		motor_right.stop();
		motor_left.endSynchronization();
		
		// Run avoid
		avoid();
	}

	/**
	 * 
	 * @param move - integer value 0 for arms, 1 for feet (I think...)
	 */
	public void move(int move){
		
		// Move forward until detection
		motor_left.synchronizeWith(new RegulatedMotor[] {motor_right});
		motor_left.startSynchronization();
		motor_left.forward();
		motor_right.forward();
		motor_left.endSynchronization();
		
		do {
			// Look for objects by distance
			ir_distance.fetchSample(ir_sample, 0);
		} while (ir_sample[0] > 30);
		
		detect();
	}

}