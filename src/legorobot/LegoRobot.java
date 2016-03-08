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
	public static RobotInteract m_RobotInteract;
	public static Speak m_Speak;
	public static Hear m_Hear;
	public static Move m_Move;

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
		
		m_RobotInteract = new RobotInteract();
		
		// Start movement
		m_RobotInteract.toMove(1); 
		
		// Forcing a keyword for now
		String keyword = "Lea";
		String response = m_RobotInteract.runInteraction(0, false, keyword);
		m_RobotInteract.toSpeak(response);
		
		
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