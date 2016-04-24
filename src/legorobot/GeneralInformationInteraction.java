package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class GeneralInformationInteraction extends Interaction {

	//private String degree = "In the ECSSE department we have 4 undergraduate programs,  5 masters programs, and 1 phd program.\n"; 
	//private String department = "The Department of Electrical, Computer, Software, and Systems Engineering is part of the College of Engineering. It is located on the third floor of the Lehman Building. \n";
	//private String scholarship = "At ERAU, there is a lot of scholarship opportunities.  The Financial Aid Office, located in the Tomcat Annex, would be able to provide you with information regarding these opportunities.  \n"; 
	//private String opening = "You've chosen to hear more information about our department.\n"; 
	//private String question = "I have lots of information about the ECSSE department!  Please let me know if you want to know about the degrees offered, the department, or want scholarship information. Please say either "degree", "department" , or "scholarship." \n"; 
	private String degree = "info_degree.wav";
	private String department = "info_department.wav";
	private String scholarship = "info_scholarship.wav";
	private String opening = "flyer_introduction.wav";
	private String question = "flyer.wav";
	
	public GeneralInformationInteraction() {
		super();
		setOpening(opening);
		setQuestion(question);
		times++;
	}
	
	/* Getters */
	protected String getPhrase(String keyword) {
		String phrase = "";
		setTimes(0);
		
		if (keyword.compareTo("degree") == 0) {
			phrase = degree;
		}
		else if (keyword.compareTo("scholarship") == 0) {
			phrase = scholarship;
		}
		else if (keyword.compareTo("department") == 0) {
			phrase = department;
		}
		return phrase;
	}
}