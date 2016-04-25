package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */

/** 
 * This class represents the hearing interface between the robot and the listening code (on the Raspberry Pi).
 * Currently this class hardcodes the conversation tier by setting the keywords in the correct tiers. 
 * In the future, the keyword would be set by retrieving it from the listening code.
 * This could not be implemented because of schedule and hardware restrictions.
 * 
 * @author JessUpde
 */
public class Hear {
	/* tier_listen is which keywords can be heard at the current part of the convo (i.e. the convo tree)
	 * 0 - Leah
	 * 1 - Information, Flyer
	 * 2 - Degree, Scholarship (The Flyer Keywords)
	 * 3 - Degree, Scholarship, Department (The Information Keywords)
	 */
	private int tier_listen = 0;
	public String keyword;	
	
	public Hear(){
	}

	public String getKeyword(){
		/*
		 * This function is forced to set the conversation a certain way. The tier_listen should be dynamically set 
		 * depending on which keyword was heard when actually listening.
		 */
		
		/* tier_listen is what keywords can be heard at the current part of the convo
		 * 0 - Leah
		 * 1 - information, flyer
		 * 2 - degree, scholarship (The flyer Keywords)
		 * 3 - degree, scholarship, department (The information keywords)
		 */
		switch (tier_listen) {
			case 0: setKeyword("Leah"); 
					tier_listen = 1;
					break;
			case 1: setKeyword("flyer"); // Hardcoded because listening is not incorporated yet
					if (keyword.compareTo("flyer") == 0) {
						tier_listen = 2;
					}
					else if (keyword.compareTo("information") == 0) {
						tier_listen = 3;
					}
					break;
			case 2: setKeyword("scholarship"); // Hardcoded because listening is not incorporated yet
					tier_listen = 4;
					break;
			case 3: setKeyword("department"); // Hardcoded because listening is not incorporated yet
					tier_listen = 4;
					break;
			case 4: setKeyword(" "); // Forced close for now
					tier_listen = 0; 
					break;
			default: setKeyword(""); 
					break;
		}
		return keyword;		
	}

	// Keyword setter
	public void setKeyword(String keyword){
		this.keyword = keyword;
	}
}