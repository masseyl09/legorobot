package legorobot;

import lejos.hardware.BrickFinder;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.utility.Delay;

// Basic test code found at:
// http://thetechnicgear.com/2014/04/howto-install-lejos-0-8-1-lego-mindstorms-ev3/screenshot-6/

public class test {
	
	public static void main(String[] args) {
		GraphicsLCD g = BrickFinder.getDefault().getGraphicsLCD();
		
		g.drawString("Hello World", 0, 0, GraphicsLCD.VCENTER | GraphicsLCD.LEFT);
		
		Delay.msDelay(5000);
	}
}