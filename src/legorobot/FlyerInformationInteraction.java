package legorobot;

import lejos.utility.Delay;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class FlyerInformationInteraction extends Interaction {

	private Move m_Move;
	private Speak m_Speak;
	private String degree_flyer = "flyer_degree.wav";
	private String scholar_flyer = "flyer_scholarship.wav";
	private String degree = "flyer_degree_info.wav";
	private String scholarship = "flyer_scholarship_info(1).wav";
	private String opening = "flyer_introduction.wav";
	private String question = "flyer.wav";
	
	public FlyerInformationInteraction(Move move, Speak speak) {
		super();
		setOpening(opening);
		setQuestion(question);
		this.m_Move = move;
		this.m_Speak = speak;
		times++;
	}
	
	/* Getters */
	protected String getPhrase(String keyword) {
		String phrase = "";
		setTimes(0);
		if (keyword.compareTo("degree") == 0) {
			toSpeak(degree_flyer);
			moveArms();
			phrase = degree;
		}
		else if (keyword.compareTo("scholarship") == 0) {
			toSpeak(scholar_flyer);
			moveArms();
			phrase = scholarship;
		}
		return phrase;
	}
	
	private void moveArms() {
		m_Move.startMoving(0);
	}
	
	private void toSpeak(String response) {
		m_Speak.respond(response);
	}
}