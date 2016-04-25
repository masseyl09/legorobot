package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
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