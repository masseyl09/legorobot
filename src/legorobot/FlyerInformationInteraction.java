package legorobot;

import lejos.utility.Delay;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class FlyerInformationInteraction extends Interaction {

	//private String degree_flyer = "Please take a degree flyer from my left hand. \n"; 
	//private String scholar_flyer = "Please take a flyer from my right hand.\n"; 
	//private String degree = "The flyer will provide more information about  the ECSSE department's degree options including four undergraduate programs,  five masters programs, and one PhD program. \n";
	//private String scholarship = "The flyer will show that there is a lot of scholarship opportunities at ERAU.  If you have further questions about the programs, the Financial Aid Office, located in the Tomcat Annex, would be able to provide you with information.\n"; 
	//private String opening = "You've chosen to hear more information about our flyers.\n"; 
	//private String question = "I have two types of flyers. Please let me know which flyer you would like. If you would like one on scholarship information please say ""scholarship"" or if you would like one about the degrees offered say ""degree.""\n"; 
	private Move m_Move;
	private String degree_flyer = "flyer_degree.wav";
	private String scholar_flyer = "flyer_scholarship.wav";
	private String degree = "flyer_degree_info.wav";
	private String scholarship = "flyer_scholarship_info(1).wav";
	private String opening = "flyer_introduction.wav";
	private String question = "flyer.wav";
	
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