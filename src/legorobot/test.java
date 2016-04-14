package legorobot;

import java.util.Random;

import lejos.hardware.BrickFinder;
import lejos.hardware.Sound;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

// Basic test code found at:
// http://thetechnicgear.com/2014/04/howto-install-lejos-0-8-1-lego-mindstorms-ev3/screenshot-6/
//used by grad students at ERAU
//

public class test {
	
	public static void main(String[] args) {	
		/*GraphicsLCD g = BrickFinder.getDefault().getGraphicsLCD();	
		g.drawString("Hello World", 0, 0, GraphicsLCD.VCENTER | GraphicsLCD.LEFT);
		Delay.msDelay(5000);*/
		
		/*for (int i = 0; i < 20; i++) {
			Random random = new Random();
			int random_degrees = random.nextInt(290 - 70 + 1) + 70;
			// Debugging - to make sure the degrees are random
			System.out.println(random_degrees);
		}*/

		RegulatedMotor motor_arms = new EV3MediumRegulatedMotor(BrickFinder.getDefault().getPort("B"));
		
		// Move the arms up
		motor_arms.rotate(360*2);
		Sound.beep();
		
		// Pause for 60 seconds
		Delay.msDelay(1000);//*60);

		// Move the arms back down
		motor_arms.rotate(-360*2);
		
	}
}
