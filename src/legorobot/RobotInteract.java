package legorobot;

import lejos.utility.Delay;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class RobotInteract {

	private String keyword;
	private BasicInteraction tierBasic;
	private FlyerInformationInteraction tierFlyer;
	private GeneralInformationInteraction tierGeneral;
	private IntroductionInteraction tierIntroduction;
	private Interaction tier;
	private Speak m_Speak;
	private Move m_Move;
	private Robot robot;
	private int times = 0;
	
	public RobotInteract(Robot robot, Speak speak, Move move) {
		this.robot = robot;
		tierBasic = new BasicInteraction();
		tierFlyer = new FlyerInformationInteraction(move, speak);
		tierGeneral = new GeneralInformationInteraction();
		tierIntroduction = new IntroductionInteraction();
		this.m_Speak = speak;
		this.m_Move = move;
	}

	/**
	 * 
	 * @param keyword
	 */
	public void runInteraction(String keyword) {
		this.keyword = keyword;
		
		// Depending on keyword, set the type of interaction we are in
		// If-else on the keyword to set the tier type
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
		tierStart();
	}

	private void tierStart() {
		times = tier.getTimes();
		
		if (times == 0 || times == 1) {
			toSpeak(tier.getOpening());
			Delay.msDelay(1000*2);
			if (times == 1) { // This is a tier with another question...
				toSpeak(tier.getQuestion());
				tier.setTimes(2); // Allow for the specific answer to the second question
			}
		}
		else if (tier.getTimes() == 2) {
			Delay.msDelay(1000*2);
			toSpeak(tier.getPhrase(keyword));
			Delay.msDelay(1000);
			toSpeak(tier.getClosing());
		}
		robot.listen();
	}
	
	protected void toSpeak(String response) {
		m_Speak.respond(response);
	}
	
	protected void toMove(int move) {
		m_Move.startMoving(move);
	}
}