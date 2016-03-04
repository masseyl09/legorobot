package legorobot;

import java.util.Locale;

import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:09 PM
 */
public class Speak {

	


	public Speak(){

	}

	/**
	 * 
	 * @param response
	 */
	public void respond(String response){
	try{
		Synthesizer leaTalk = Central.createSynthesizer(new SynthesizerModeDesc(null, "general", Locale.US, null, null));
		leaTalk.speak("Hello", null);
		
	} catch (Exception e){
		e.printStackTrace();
	}
	
	
		

	}

}