package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class IntroductionInteraction extends Interaction {

	public String opening = "Hi, I'm Lea!";
	public String question = "Would you like information or a flyer?";
	
	public IntroductionInteraction() {
		super();
		toSpeak(opening);
		toSpeak(question);
	}

	/**
	 * 
	 * @param num_repeat
	 * @param repeat
	 */
	public void repeat(int num_repeat, String repeat) {
		if (num_repeat == 0) {
			toSpeak(repeat);
			toSpeak(question);
		}
		
		else {
			toSpeak(exit);
		}
	}

	/**
	 * 
	 * @param move
	 */
	public void toMove(boolean move) {

	}

	/**
	 * 
	 * @param phrase
	 */
	public String toSpeak(String phrase) {
		return phrase;
	}

}