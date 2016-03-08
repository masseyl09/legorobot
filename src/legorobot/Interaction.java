package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public abstract class Interaction {
	
	// Basic phrases all interactions share (unless they override a certain phrase)
	private String closing = "Thank you for speaking with me. Goodbye.";
	private String confirm = "Just to confirm, did you say"; //Will be completed in RobotInteract by concatenating the keyword to the string
	private String exit = "I don't think I understood you. Goodbye.";
	private boolean move = false;
	private String repeat = "I'm sorry, I didn't understand you.";
	private String opening = "Hello";
	private String question = "Can I help you?";
	
	public Interaction() {	
	}
	
	protected String getClosing() {
		return closing;
	}
	
	protected void setClosing(String closing) {
		this.closing = closing;
	}
	
	
	protected String getConfirm() {
		return confirm;
	}
	
	protected void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
	protected String getExit() {
		return exit;
	}
	
	protected void setExit(String exit) {
		this.exit = exit;
	}
	
	protected boolean getMove() {
		return move;
	}
	
	protected void setMove(boolean move) {
		this.move = move;
	}
	
	protected String getRepeat() {
		return repeat;
	}
	
	protected void setRepeat(String repeat) {
		this.repeat = repeat;
	}
	
	protected String getOpening() {
		return opening;
	}
	
	protected void setOpening(String opening) {
		this.opening = opening;
	}
	
	protected String getQuestion() {
		return question;
	}
	
	protected void setQuestion(String question) {
		this.question = question;
	}
}