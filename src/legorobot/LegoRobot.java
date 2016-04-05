package legorobot;

import java.util.Collection;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */

public class LegoRobot {

	//private Collection<Table> available_tables;
	public int start_tier = 0;
	public RobotInteract m_RobotInteract;
	public Speak m_Speak;
	public Hear m_Hear;
	public Move m_Move;
	public String keyword;
	public String response;

	/**
	 * 
	 * @param available_tables
	 */
	/*public int getTable(Collection<Table> available_tables){
		return 0;
	}*/

	public static void main(String[] args) {
		
		// Create instances
		LegoRobot robot = new LegoRobot();
		robot.m_RobotInteract = new RobotInteract(robot);
		robot.m_Move = new Move();
		robot.m_Hear = new Hear();
		
		// Begin logic
		robot.run();
	}
	
	private void run() {
	
		// Start movement
		m_Move.startMoving(1);
		
		// Listen on the start tier
		listen(start_tier);
	}
	
	public void listen(int tier) {
		
		do {
			// Forcing a keyword for now
			keyword = m_Hear.getKeyword(tier);
		} while (keyword.compareTo("") == 0);
		
		// Stop moving, start interaction
		if (m_Move.isRobotMoving()) {
			m_Move.stopMoving();
		}
		m_RobotInteract.runInteraction(tier, true, keyword);
	}

	/**
	 * 
	 * @param current_tier
	 */
	public int setTable(int current_tier) {
		return 0;
	}

}