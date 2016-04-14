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
	protected String getDegree() {
		setTimes(0);
		return degree;
	}
	
	protected String getDepartment() {
		setTimes(0);
		return department;
	}
	
	protected String getScholarship() {
		setTimes(0);
		return scholarship;
	}	
}