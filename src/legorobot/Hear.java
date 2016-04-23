package legorobot;

import java.util.Collection;

import lejos.utility.Delay;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class Hear {
	/* tier_listen is what keywords can be heard at the current part of the convo
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
			case 1: setKeyword("flyer"); // Hardcoded for now
					if (keyword.compareTo("flyer") == 0) {
						tier_listen = 2;
					}
					else if (keyword.compareTo("information") == 0) {
						tier_listen = 3;
					}
					break;
			case 2: setKeyword("scholarship"); // Hardcoded for now
					tier_listen = 4;
					break;
			case 3: setKeyword("degree"); // Hardcoded for now
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

	/**
	 * 
	 * @param keyword
	 */
	public void setKeyword(String keyword){
		this.keyword = keyword;
	}
}