package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class IntroductionInteraction extends Interaction {

	private String opening = "Hi, I'm Lea!";
	private String question = "Would you like to hear more information about the Electrical, Computer, Software, and System Engineering Department or a flyer? Say department or flyer to choose.";
	
	public IntroductionInteraction() {
		super();
		setOpening(opening);
		setQuestion(question);
	}
}