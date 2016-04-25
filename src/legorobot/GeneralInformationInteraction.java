package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 * 
 * This class defines the specific implementation of the General Information tier.
 */
public class GeneralInformationInteraction extends Interaction {

	private String degree = "info_degree.wav";
	private String department = "info_department.wav";
	private String scholarship = "info_scholarship.wav";
	private String opening = "information_intro.wav";
	private String question = "information.wav";
	
	public GeneralInformationInteraction() {
		super();
		setOpening(opening);
		setQuestion(question);
		times++; // Increment times to indicate we have a second question
	}
	
	// Getter that changes the convo depending on the answer to the question
	protected String getPhrase(String keyword) {
		setTimes(0); // Set times back to zero since this is the end of this convo branch
		String phrase = ""; // Default in case there is an error when checking the keyword
		
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