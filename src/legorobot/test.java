package legorobot;

import java.util.Random;

import lejos.hardware.BrickFinder;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.utility.Delay;

// Basic test code found at:
// http://thetechnicgear.com/2014/04/howto-install-lejos-0-8-1-lego-mindstorms-ev3/screenshot-6/
//used by grad students at ERAU
//

public class test {
	
	public static void main(String[] args) {
		GraphicsLCD g = BrickFinder.getDefault().getGraphicsLCD();	
		g.drawString("Hello World", 0, 0, GraphicsLCD.VCENTER | GraphicsLCD.LEFT);
		Delay.msDelay(5000);
		
		/*for (int i = 0; i < 20; i++) {
			Random random = new Random();
			int random_degrees = random.nextInt(290 - 70 + 1) + 70;
			// Debugging - to make sure the degrees are random
			System.out.println(random_degrees);
		}*/
	}
}
