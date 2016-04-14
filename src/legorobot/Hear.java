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



	public void finalize() throws Throwable {

	}

	public Hear(){

	}

	public boolean getConfirmed(){
		return false;
	}

	public String getKeyword(int tier){
		switch (tier) {
			case 0: setKeyword("Leah"); break;
			case 1: setKeyword("department"); break;
			case 2: setKeyword("degree"); break;
			case 3: setKeyword("goodbye"); break;
			case 4: setKeyword(" "); break;
			default: setKeyword(""); break;
		}
		return keyword;
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