package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class IntroductionInteraction extends Interaction {

	private String opening = "Hi, I'm Lea!"; // ii_opening.wav
	private String question = "Would you like to hear more information about the ECSSE Department or a flyer? Say information or flyer to choose."; // ii_question.wav
	
	public IntroductionInteraction() {
		super();
		setOpening(opening);
		setQuestion(question);
	}
}