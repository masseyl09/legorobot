package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class FlyerInformationInteraction extends Interaction {

	private String degree = "Take a flyer from my left hand. The degree flyer lists information about our available degree programs here at Embry-Riddle.\n"; 
	private boolean moveArms = true;
	private String scholarship = "Take a flyer from my right hand. The scholarship flyer shows there are no available scholarships right now.\n";
	private String opening = "You've chosen to hear more information about our flyers.\n";
	private String question = "Would you like a flyer on degree programs or scholarship information? Say degree or scholarship.\n";

	public FlyerInformationInteraction() {
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
	
	protected String getScholarship() {
		setTimes(0);
		return scholarship;
	}
	
	protected boolean getMoveArms() {
		setTimes(0);
		return moveArms;
	}
}