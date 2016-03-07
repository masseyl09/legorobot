package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class GeneralInformationInteraction extends Interaction {

	public String degree = "The degrees here are awesome!";
	public String department = "We have four departments here: electrical engineering, computer engineering, software engineering, and systems engineering.";
	public String scholarship = "There are no scholarships available right now.";
	public String opening = "You've chosen to hear more information about our department.";
	public String question = "Would you like information on degrees, departments, or scholarships?";

	public GeneralInformationInteraction() {
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