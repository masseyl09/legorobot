package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class BasicInteraction extends Interaction {
	private String opening = "Say Lea if you'd like to speak with me.";
	private String question = "Did you say something?";
	
	public BasicInteraction() {
		super();
		setOpening(opening);
		setQuestion(question);
	}	
}