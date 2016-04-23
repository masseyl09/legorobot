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
 */
public class Speak {

	public Speak() {
	}

	/**
	 * 
	 * @param response
	 */
	public void respond(String response){
	/*	try {
			Synthesizer leaTalk = Central.createSynthesizer(new SynthesizerModeDesc(null, "general", Locale.US, null, null));
			leaTalk.speak(response, null);
			leaTalk.waitEngineState(Synthesizer.QUEUE_EMPTY);

		} catch (Exception e){
			e.printStackTrace();
		}*/
		
		/*File soundFile = new File("/Users/JessUpde/legorobot/intro.wav");
		int error = Sound.playSample(soundFile);
		System.out.println(error);*/
		
		// Pseudo speaking for now (beeps once for yes, two for now)
		if (response.compareTo("Yes") == 0) {
			Sound.beep();
		}
		else {
			Sound.twoBeeps();
		}
		
	}

}