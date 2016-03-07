package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class BasicInteraction extends Interaction {
	public String opening = "Say Lea if you'd like to speak with me.";
	public String question = "Did you say something?";
	
	public BasicInteraction() {
		super();
		toSpeak(opening);
	}

	public void repeat(int num_repeat, String repeat) {
		if (num_repeat == 0) {
			toSpeak(repeat);
			toSpeak(opening);
		}
		
		else {
			toSpeak(exit);
		}
	}

	public void toMove(boolean move) {

	}

	public String toSpeak(String phrase) {
		return phrase;
	}
}