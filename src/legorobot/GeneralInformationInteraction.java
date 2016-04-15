package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class GeneralInformationInteraction extends Interaction {

	private String degree = "The degrees here are awesome!\n";
	private String department = "We have four departments here: electrical engineering, computer engineering, software engineering, and systems engineering.\n";
	private String scholarship = "There are no scholarships available right now.\n";
	private String opening = "You've chosen to hear more information about our department.\n";
	private String question = "Would you like information on degrees, departments, or scholarships?\n";

	public GeneralInformationInteraction() {
		super();
		setOpening(opening);
		setQuestion(question);
		times++;
	}
	
	/* Getters */
	protected String getPhrase(String keyword) {
		String phrase = "";
		setTimes(0);
		
		if (keyword.compareTo("degree") == 0) {
			phrase = degree;
		}
		else if (keyword.compareTo("scholarship") == 0) {
			phrase = scholarship;
		}
		else if (keyword.compareTo("department") == 0) {
			phrase = department;
		}
		return phrase;
	}
}