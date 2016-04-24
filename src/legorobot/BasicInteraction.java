package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class BasicInteraction extends Interaction {
	private String opening = "Say Leah if you'd like to speak with me.\n"; //not implemented 
	private String question = "Did you say something?\n";//not implemented 
	private String repeat = "Did you say Leah?\n";//not implemented
	
	public BasicInteraction() {
		super();
		setOpening(opening);
		setQuestion(question);
		setRepeat(repeat);
	}	
}