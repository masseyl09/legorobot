package legorobot;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3IRSensor;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class Move {

	private EV3ColorSensor color_sensor;
	private EV3IRSensor infrared_sensor;
	private EV3LargeRegulatedMotor motor1;
	private EV3LargeRegulatedMotor motor2;
	private EV3MediumRegulatedMotor motor3;
	private double power;
	private double speed;



	public void finalize() throws Throwable {

	}

	public void Move(){

	}

	public void avoid(){

	}

	public void detect(){

	}

	/**
	 * 
	 * @param move
	 */
	public int move(boolean move){
		return 0;
	}

}