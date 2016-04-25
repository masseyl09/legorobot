package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 */

class Robot {
	
	public RobotInteract m_RobotInteract;
	public Speak m_Speak;
	public Hear m_Hear;
	public Move m_Move;
	private String keyword;
	
	public void run() {
	
		// Start movement
		//m_Move.startMoving(1);
		
		// Listen on the start tier
		listen();
	}
	
	public void listen() {
		
		do {
			// Forcing a keyword for now
			keyword = m_Hear.getKeyword();
		} while (keyword.compareTo("") == 0);
		
		// Stop moving, start interaction
		if (m_Move.isRobotMoving()) {
			m_Move.stopMoving();
		}
		
		if (keyword.compareTo(" ") == 0) {
			return; // Stop for now
		}
		
		m_RobotInteract.runInteraction(keyword);
	}
}