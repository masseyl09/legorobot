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
	private String opening = "You've chosen to hear more information about our flyers.";
	private String question = "Would you like a flyer on degrees scholarships?";

	public FlyerInformationInteraction() {
		super();
		setOpening(opening);
		setQuestion(question);
	}
	
	/* Getters */
	protected String getDegree() {
		return degree;
	}
	
	protected String getScholarship() {
		return scholarship;
	}
	
	protected boolean getMoveArms() {
		return moveArms;
	}
}