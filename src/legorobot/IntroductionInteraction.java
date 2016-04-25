package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 * 
 * This class defines the specific implementation of the Introduction tier, which introduces LEA.
 */
public class IntroductionInteraction extends Interaction {

	private String opening = "introduction.wav";
	
	public IntroductionInteraction() {
		super();
		setOpening(opening);
	}
}