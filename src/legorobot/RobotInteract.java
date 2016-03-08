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
	private static Speak m_Speak;
	private static Hear m_Hear;
	private static Move m_Move;

	public RobotInteract() {
		tierBasic = new BasicInteraction();
		tierFlyer = new FlyerInformationInteraction();
		tierGeneral = new GeneralInformationInteraction();
		tierIntroduction = new IntroductionInteraction();
		m_Speak = new Speak();
		m_Move = new Move();
	}

	/**
	 * 
	 * @param current_tier
	 * @param confirm
	 * @param keyword
	 */
	public String runInteraction(int current_tier, boolean confirm, String keyword) {
		confirmed = confirm;
		this.keyword = keyword;
		this.current_tier = current_tier;
		
		// Depending on tier, set the type of interaction we are in
		switch (current_tier) {
			case 0: tier = tierBasic; break;
			case 1: tier = tierIntroduction; break;
			case 2: tier = tierGeneral; break;
			case 3: tier = tierFlyer; break;
		}
				
		result = checkConfirmation();
		return result;
	}
	
	private String checkConfirmation() {
		if (confirmed == false) {
			result = tierRepeat();
		}
		
		else {
			result = tierStart();
		}
		
		return result;
	}

	private String tierRepeat() {
		return "No";
	}

	private String tierStart() {
		return "Yes";
	}
	
	public void toSpeak(String response) {
		m_Speak.respond(response);
	}
	
	public void toMove(int move) {
		m_Move.startMoving(move);
	}
}