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
	private BasicInteraction tierBasic;
	private FlyerInformationInteraction tierFlyer;
	private GeneralInformationInteraction tierGeneral;
	private IntroductionInteraction tierIntroduction;
	private Interaction tier;



	public RobotInteract() {
	}
	
	/**
	 * 
	 * @param confirm
	 * @param current_tier
	 */
	public String checkConfirmation(boolean confirm, int current_tier) {
		String result;
		if (confirm == false) {
			result = tierRepeat(keyword, current_tier, confirm);
		}
		
		else {
			result = tierStart(keyword, current_tier);
		}
		
		return result;
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
		String result = checkConfirmation(confirm, current_tier);
		
		return result;
	}

	/**
	 * 
	 * @param keyword
	 * @param current_tier
	 * @param confirm
	 */
	public String tierRepeat(String keyword, int current_tier, boolean confirm) {
		String result = "No";
		return result;
	}

	/**
	 * 
	 * @param keyword
	 * @param current_tier
	 */
	public String tierStart(String keyword, int current_tier) {
		String result = "Yes";
		
		if (current_tier == 0) {
			tier = new IntroductionInteraction();	
		}
		
		return result;

	}

}