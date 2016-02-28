package legorobot;

import java.util.Collection;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */

public class LegoRobot {

	//private Collection<Table> available_tables;
	public int current_tier;
	public RobotInteract m_RobotInteract;
	public Speak m_Speak;
	public Hear m_Hear;
	public Move m_Move;

	public LegoRobot(){
	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param available_tables
	 */
	/*public int getTable(Collection<Table> available_tables){
		return 0;
	}*/

	public static void main(String[] args) {
		Move m_Move = new Move();
		
		// while there is no Keyword heard, move, detect, and avoid
		m_Move.move(1);
		
	}

	/**
	 * 
	 * @param current_tier
	 */
	public int setTable(int current_tier){
		return 0;
	}

}