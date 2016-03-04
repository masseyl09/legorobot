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

	public LegoRobot() {
	}

	/**
	 * 
	 * @param available_tables
	 */
	/*public int getTable(Collection<Table> available_tables){
		return 0;
	}*/

	public static void main(String[] args) {
		//Move m_Move = new Move();
		Speak m_Speak = new Speak();
		m_Speak.respond("Hello");
		//m_Move.startMoving(1);
		// Loop this somehow...
		// Start moving (if not already moving)
		/*if (!m_Move.isRobotMoving()) {
			m_Move.startMoving(1);
		}*/

		// Listen for a keyword (maybe use a listener?)

		// Stop moving when "Lea is heard", execute tier logic
		

		
	}

	/**
	 * 
	 * @param current_tier
	 */
	public int setTable(int current_tier) {
		return 0;
	}

}