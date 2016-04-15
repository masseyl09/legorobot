package legorobot;

import lejos.utility.Delay;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class FlyerInformationInteraction extends Interaction {

	private String degree_flyer = "Take a flyer from my left hand.\n"; // fi_degree_flyer.wav
	private String scholar_flyer = "Take a flyer from my right hand.\n"; // fi_scholar_flyer.wav
	private String degree = "The degree flyer lists information about our available degree programs here at Embry-Riddle.\n"; // fi_degree.wav
	private String scholarship = "The scholarship flyer shows there are no available scholarships right now.\n"; // fi_scholarship.wav
	private String opening = "You've chosen to hear more information about our flyers.\n"; // fi_opening.wav
	private String question = "Would you like a flyer on degree programs or scholarship information? Say degree or scholarship.\n"; // fi_question.wav
	private Move m_Move;
	
	public FlyerInformationInteraction(Move move) {
		super();
		setOpening(opening);
		setQuestion(question);
		this.m_Move = move;
		times++;
	}
	
	/* Getters */
	protected String getPhrase(String keyword) {
		String phrase = "";
		setTimes(0);
		if (keyword.compareTo("degree") == 0) {
			System.out.println(degree_flyer);
			moveArms();
			Delay.msDelay(1000*5);
			phrase = degree;
		}
		else if (keyword.compareTo("scholarship") == 0) {
			System.out.println(scholar_flyer);
			moveArms();
			phrase = scholarship;
		}
		return phrase;
	}
	
	private void moveArms() {
		m_Move.startMoving(0);
	}
}