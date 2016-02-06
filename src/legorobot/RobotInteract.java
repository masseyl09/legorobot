

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class RobotInteract {

	private boolean confirmed;
	private String keyword;
	private BasicInteraction tierBasic;
	private FlyerInformationInteraction tierFlyer;
	private GeneralInformationInteraction tierGeneral;
	private IntroductionInteraction tierIntroduction;
	public FlyerInformationInteraction m_FlyerInformationInteraction;
	public GeneralInformationInteraction m_GeneralInformationInteraction;
	public BasicInteraction m_BasicInteraction;
	public IntroductionInteraction m_IntroductionInteraction;



	public void finalize() throws Throwable {

	}

	public void RobotInteract(){

	}

	/**
	 * 
	 * @param confirm
	 * @param current_tier
	 */
	public void checkConfirmation(boolean confirm, int current_tier){

	}

	/**
	 * 
	 * @param current_tier
	 * @param confirm
	 * @param keyword
	 */
	public int runInteraction(int current_tier, boolean confirm, String keyword){
		return 0;
	}

	/**
	 * 
	 * @param keyword
	 * @param current_tier
	 * @param confirm
	 */
	public int tierRepeat(String keyword, int current_tier, boolean confirm){
		return 0;
	}

	/**
	 * 
	 * @param keyword
	 * @param current_tier
	 */
	public void tierStart(String keyword, int current_tier){

	}

}