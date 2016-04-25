package legorobot;

import lejos.utility.Delay;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 * 
 * This class contains all the interaction logic for the conversation tier. It sets which tiers go to which keywords
 * and creates the conversation tier logic.
 */
public class RobotInteract {
	
	// Initialize variables
	private String keyword;
	private BasicInteraction tierBasic;
	private FlyerInformationInteraction tierFlyer;
	private GeneralInformationInteraction tierGeneral;
	private IntroductionInteraction tierIntroduction;
	private Interaction tier;
	private Robot robot;
	private int times = 0;
	
	/**
	 * This class needs access the robot functionality in order for the tiers to speak and move the arms.
	 * @param robot
	 * @param speak
	 * @param move
	 */
	public RobotInteract(Robot robot) {
		this.robot = robot;
		tierBasic = new BasicInteraction();
		tierFlyer = new FlyerInformationInteraction(robot);
		tierGeneral = new GeneralInformationInteraction();
		tierIntroduction = new IntroductionInteraction();
	}

	/**
	 * This class runs the main interaction logic by instantiating the correct tier depending on which keyword was passed
	 * @param keyword - String
	 */
	public void runInteraction(String keyword) {
		this.keyword = keyword;
		
		// Depending on keyword, set the type of interaction we are in
		if (keyword.compareTo("Leah") == 0) {
			System.out.println("Listening...");
			Delay.msDelay(1000);
			tier = tierIntroduction;
		}
		else if (keyword.compareTo("flyer") == 0) {
			tier = tierFlyer;
		}
		else if (keyword.compareTo("information") == 0) {
			tier = tierGeneral;
		}
		
		// Begin the tier to start the tier's internal logic
		tierStart();
	}
	
	/**
	 * This function runs the internal tier logic depending on a time flag variable.
	 * If it's the first time entering this tier, the opening is stated.
	 * Certain tiers have a second statement/question and uses setTimes to tell tierStart that upon re-enter
	 * the second response needs to be said. This is generically grabbed using the getPhrase() function.
	 */
	private void tierStart() {
		
		// How many times have we entered tierStart/are we a tier with a second question
		times = tier.getTimes();
		
		// First time entering... 
		if (times == 0 || times == 1) {
			robot.toSpeak(tier.getOpening());
			Delay.msDelay(1000*2);
			
			// This is a tier with another question...
			if (times == 1) { 
				robot.toSpeak(tier.getQuestion());
				tier.setTimes(2); // Set to allow for the specific answer to the second question upon re-enter
			}
		}
		
		// Second time entering...
		else if (tier.getTimes() == 2) {
			Delay.msDelay(1000*2);
			
			// Respond and exit
			robot.toSpeak(tier.getPhrase(keyword));
			Delay.msDelay(1000);
			robot.toSpeak(tier.getClosing());
		}
		
		// After completing the tier, start listening for another keyword
		robot.listen();
	}
}