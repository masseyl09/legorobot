package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public abstract class Interaction {
	
	// Basic phrases all interactions share
	private String exit = "";// implemented in subclasses
	private String repeat = "";// implemented in subclasses
	private String opening = ""; // implemented in subclasses
	private String question = ""; // implemented in subclasses
	private String closing = "goodbye.wav";
	
	protected int times = 0;
	
	public Interaction() {	
	}
	
	protected String getClosing() {
		return closing;
	}
	
	protected void setClosing(String closing) {
		this.closing = closing;
	}
	
	protected String getExit() {
		return exit;
	}
	
	protected void setExit(String exit) {
		this.exit = exit;
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
	
	protected int getTimes() {
		return times;
	}
	
	protected void setTimes(int time) {
		this.times = time;
	}

	protected String getPhrase(String keyword) {
		return "";
	}
}