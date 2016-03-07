package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public abstract class Interaction {

	protected String closing;
	protected String confirm;
	protected String exit;
	protected boolean move;
	protected String repeat;
	
	// Basic phrases all interactions share (unless they override a certain phrase)
	public Interaction() {
		closing = "Thank you for speaking with me. Goodbye.";
		confirm = "Just to confirm, did you say"; //Will be completed in RobotInteract by concatenating the keyword to the string
		exit = "I don't think I understood you. Goodbye.";
		move = false;
		repeat = "I'm sorry, I didn't understand you.";
	}

	public abstract void repeat(int num_repeat, String repeat);
	public abstract void toMove(boolean move);
	public abstract String toSpeak(String phrase);

}