package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 * 
 * This class defines a Basic Interaction. This class is not implemented in version 1 as we did not do major
 * error checking/confirming of keywords. 
 */
public class BasicInteraction extends Interaction {
	private String opening = "Say Leah if you'd like to speak with me.\n";
	private String question = "Did you say something?\n"; 
	private String repeat = "Did you say Leah?\n";
	
	public BasicInteraction() {
		super();
		setOpening(opening);
		setQuestion(question);
		setRepeat(repeat);
	}	
}