package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class GeneralInformationInteraction extends Interaction {

	private String degree = "The degrees here are awesome!";
	private String department = "We have four departments here: electrical engineering, computer engineering, software engineering, and systems engineering.";
	private String scholarship = "There are no scholarships available right now.";
	private String opening = "You've chosen to hear more information about our department.";
	private String question = "Would you like information on degrees, departments, or scholarships?";

	public GeneralInformationInteraction() {
		super();
		setOpening(opening);
		setQuestion(question);
	}
	
	/* Getters */
	protected String getDegree() {
		return degree;
	}
	
	protected String getDepartment() {
		return department;
	}
	
	protected String getScholarship() {
		return scholarship;
	}
	
}