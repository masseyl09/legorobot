package legorobot;

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
		switch (current_tier) {
			//case 0: tier = tierBasic; break;
			case 0: tier = tierIntroduction; break;
			case 1: tier = tierGeneral; break;
			case 2: tier = tierFlyer; break;
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
		System.out.println(tier.getOpening());
		System.out.println(tier.getQuestion());
		
		robot.listen(current_tier + 1); // Change to a get_next_tier method possibly?
	}
	
	public void toSpeak(String response) {
		m_Speak.respond(response);
	}
	
	public void toMove(int move) {
		m_Move.startMoving(move);
	}
}