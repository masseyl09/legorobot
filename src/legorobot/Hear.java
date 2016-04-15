package legorobot;

import java.util.Collection;

import lejos.utility.Delay;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */
public class Hear {

	//public Collection<Table> available_tables;
	public boolean confirm;
	//public SerialData data;
	//public RemotePort ears;
	public String keyword;
	public String text_string;
	
	/* tier_listen is what keywords can be heard at the current part of the convo
	 * 0 - Leah
	 * 1 - Information, Flyer
	 * 2 - Degree, Scholarship (The Flyer Keywords)
	 * 3 - Degree, Scholarship, Department (The Information Keywords)
	 */
	private int tier_listen = 0;

	public void finalize() throws Throwable {

	}

	public Hear(){

	}

	public boolean getConfirmed(){
		return false;
	}

	public String getKeyword(){
		
		/*
		 * This function is forced to set the conversation a certain way. The tier_listen should be dynamically set 
		 * depending on which keyword was heard when actually listening.
		 */
		/* tier_listen is what keywords can be heard at the current part of the convo
		 * 0 - Leah
		 * 1 - Information, Flyer
		 * 2 - Degree, Scholarship (The Flyer Keywords)
		 * 3 - Degree, Scholarship, Department (The Information Keywords)
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
//		
//		if (tier_listen == 0) {
//			setKeyword("Leah"); 
//			tier_listen = 1;
//		}
//		else if (tier_listen == 1) {
//			// Keyword can be flyer or information
//			setKeyword("information");
//			if (keyword.compareTo("flyer") == 0) {
//				tier_listen = 2;
//			}
//			else if (keyword.compareTo("information") == 0) {
//				tier_listen = 3;
//			}
//		}
//		else if (tier_listen == 2) {
//			// Keyword can be degree or scholarship
//			setKeyword("scholarship");
//			tier_listen = 4;
//		}
//		else if (tier_listen == 3) {
//			// keyword can be degree, department, or scholarship
//			setKeyword("degree");
//			tier_listen = 4;
//		}
//		else if (tier_listen == 4) {
//			setKeyword("Goodbye");
//			tier_listen = 0;
//		}
		
	}

	/**
	 * 
	 * @param confirm
	 */
	public void setConfirmed(boolean confirm){
		this.confirm = confirm;
	}

	/**
	 * 
	 * @param keyword
	 */
	public void setKeyword(String keyword){
		this.keyword = keyword;
	}

	/**
	 * 
	 * @param data
	 */
	/*public void setSountIn(SerialData data){

	}*/

	/**
	 * 
	 * @param data
	 */
	/*public String speechToText(SerialData data){
		return "";
	}*/

}