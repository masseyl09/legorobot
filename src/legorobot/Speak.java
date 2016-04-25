package legorobot;

import java.io.File;
import java.util.Locale;

import lejos.hardware.Sound;


/*import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;*/
import javax.speech.*;
import javax.speech.synthesis.*;
//import javax.speech.synthesis.Synthesizer;
/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:09 PM
 * 
 * This class allows the robot to speak. 
 */
public class Speak {

	public Speak() {
	}
	
	/**
	 * This function takes a .wav file string and plays it through the robot.
	 * @param response - .wav file as a String
	 */
	public void respond(String response){
		File soundFile = new File(response);
		Sound.playSample(soundFile, 100);		
	}
}