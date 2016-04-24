package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class IntroductionInteraction extends Interaction {

	//private String opening = "ello, I am Leah. I am the helpful assistant of the ECSSE Department!  If you would like me to tell you about this department say "information" or  want a flyer say "flyer"!";
	private String question = "Would you like to hear more information about the ECSSE Department or a flyer? Say information or flyer to choose."; //not using 
	
	private String opening = "introduction.wav";
	
	public IntroductionInteraction() {
		super();
		setOpening(opening);
		setQuestion(question); 	//i think we can get rid of line 18
	}
}