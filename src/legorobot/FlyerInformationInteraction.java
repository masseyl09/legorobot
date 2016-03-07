package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class FlyerInformationInteraction extends Interaction {

	private String degree = "The degree flyer lists information about our available degree programs here at Embry-Riddle."; 
	private boolean moveArms = true;
	private String scholarship = "The scholarship flyer shows there are no available scholarships right now.";
	public String opening = "You've chosen to hear more information about our flyers.";
	public String question = "Would you like a flyer on degrees scholarships?";

	public FlyerInformationInteraction() {
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