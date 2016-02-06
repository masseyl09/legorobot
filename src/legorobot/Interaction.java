

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public abstract class Interaction {

	private String closing;
	private String confirm;
	private String exit;
	private boolean move;
	private String repeat;

	public Interaction(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param num_repeat
	 * @param repeat
	 */
	public abstract void repeat(int num_repeat, String repeat);

	/**
	 * 
	 * @param move
	 */
	public abstract void toMove(String move);

	/**
	 * 
	 * @param phrase
	 */
	public abstract void toSpeak(String phrase);

}