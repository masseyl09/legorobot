package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 * 
 * This class defines the specific implementation of the Flyer Information tier.
 */
public class FlyerInformationInteraction extends Interaction {

	private Robot robot;
	private String degree_flyer = "flyer_degree.wav";
	private String scholar_flyer = "flyer_scholarship.wav";
	private String degree = "flyer_degree_info.wav";
	private String scholarship = "flyer_scholarship_info.wav";
	private String opening = "flyer_introduction.wav";
	private String question = "flyer.wav";
	
	/**
	 * This class needs access to the robot to speak some extra info and move the arms to hand out flyers.
	 * @param robot - Robot
	 */
	public FlyerInformationInteraction(Robot robot) {
		super();
		setOpening(opening);
		setQuestion(question);
		this.robot = robot;
		times++; // Increment times to indicate we have a second question
	}
	
	// Getter that changes the convo depending on the answer to the question
	protected String getPhrase(String keyword) {
		setTimes(0); // Set times back to zero since this is the end of this convo branch
		String phrase = ""; // Default in case there is an error when checking the keyword
		
		if (keyword.compareTo("degree") == 0) {
			robot.toSpeak(degree_flyer);
			robot.toMove(0);
			phrase = degree;
		}
		else if (keyword.compareTo("scholarship") == 0) {
			robot.toSpeak(scholar_flyer);
			robot.toMove(0);
			phrase = scholarship;
		}
		return phrase;
	}
}