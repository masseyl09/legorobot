package legorobot;

import lejos.utility.Delay;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class RobotInteract {

	private boolean confirmed;
	private String keyword;
	private int current_tier;
	private int num_repeat = 0;
	private String result = "No";
	private BasicInteraction tierBasic;
	private FlyerInformationInteraction tierFlyer;
	private GeneralInformationInteraction tierGeneral;
	private IntroductionInteraction tierIntroduction;
	private Interaction tier;
	private Speak m_Speak;
	private static Hear m_Hear;
	private Move m_Move;
	private Robot robot;

	public RobotInteract(Robot robot, Speak speak, Move move) {
		this.robot = robot;
		tierBasic = new BasicInteraction();
		tierFlyer = new FlyerInformationInteraction();
		tierGeneral = new GeneralInformationInteraction();
		tierIntroduction = new IntroductionInteraction();
		this.m_Speak = speak;
		this.m_Move = move;
	}

	/**
	 * 
	 * @param current_tier
	 * @param confirm
	 * @param keyword
	 */
	public void runInteraction(int current_tier, boolean confirm, String keyword) {
		confirmed = confirm;
		this.keyword = keyword;
		this.current_tier = current_tier;
		
		// Depending on tier, set the type of interaction we are in
		/* 0 - Intro
		 * 1 - General Question
		 * 2 - General Response
		 * 3 - Flyer Question
		 * 4 - Flyer Response
		 */
		switch (current_tier) {
			//case 0: tier = tierBasic; break;
			case 0: tier = tierIntroduction; break;
			case 1: // Same as 2
			case 2: tier = tierGeneral; break;
			case 3: // Same as 4
			case 4: tier = tierFlyer; break;
			default: tier = tierBasic; break;
		}
		checkConfirmation();
	}
	
	private void checkConfirmation() {
		if (confirmed == false) {
			tierRepeat();
		}
		else {
			tierStart();
		}
	}

	private String tierRepeat() {
		return "No";
	}

	private void tierStart() {
		System.out.println("\nYou said: " + keyword + "\n");
		Delay.msDelay(1000*5);
		
		if (keyword.compareTo("goodbye") == 0) {
			System.out.println(tier.getClosing());
		}
		else if (tier.getTimes() == 0) {
			System.out.println(tier.getOpening());
			Delay.msDelay(1000*2);
			System.out.println(tier.getQuestion());
		}
		// This is a tier with another question...
		else if (tier.getTimes() == 1) {
			System.out.println(tier.getOpening());
			Delay.msDelay(1000*2);
			System.out.println(tier.getQuestion());
			tier.setTimes(2); // Allow for the specific answer to the second question
		}
		else if (tier.getTimes() == 2) {
			if (keyword.compareTo("degree") == 0) {
				System.out.println(tier.getDegree());
			}
			else if (keyword.compareTo("scholarship") == 0) {
				System.out.println(tier.getScholarship());
			}
			else if (keyword.compareTo("department") == 0) {
				System.out.println(tier.getDepartment());
			}
		}
		Delay.msDelay(1000*5);
		robot.listen(current_tier + 1); // Change to a get_next_tier method possibly?
	}
	
	public void toSpeak(String response) {
		m_Speak.respond(response);
	}
	
	public void toMove(int move) {
		m_Move.startMoving(move);
	}
}