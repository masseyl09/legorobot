package legorobot;

import java.util.Collection;

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

	public String getKeyword(){
		return "";
	}

	/**
	 * 
	 * @param confirm
	 */
	public void setConfirmed(boolean confirm){

	}

	/**
	 * 
	 * @param keyword
	 */
	public void setKeyword(String keyword){

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