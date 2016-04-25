package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 * 
 * This class defines what makes a "robot" as far as the software is concerned.
 * It is composed of the speaking, hearing, and moving components, as well as the interaction logic.
 */

class Robot {
	
	public RobotInteract m_RobotInteract;
	public Speak m_Speak;
	public Hear m_Hear;
	public Move m_Move;
	private String keyword;
	
	/**
	 * This function is called by main and starts the robot. 
	 * In the current version, one command must be commented out because multithreading is not implemented.
	 * Moving would loop infinitely and would not allow the robot to "listen"
	 */
	public void run() {
	
		// Start movement
		//m_Move.startMoving(1);
		
		// Listen on the start tier
		listen();
	}
	
	/**
	 * This function listens for a keyword and stops the robot if it is moving.
	 * An interaction is then run using the keyword.
	 */
	public void listen() {
		
		do {
			// Get a keyword from the listening interface
			keyword = m_Hear.getKeyword();
		} while (keyword.compareTo("") == 0);
		
		// Stop moving
		if (m_Move.isRobotMoving()) {
			m_Move.stopMoving();
		}
		
		if (keyword.compareTo(" ") == 0) {
			return; // Stop everything
		}	
		// Start interaction logic for the keyword
		m_RobotInteract.runInteraction(keyword);
	}
	
	public void toSpeak(String response) {
		m_Speak.respond(response);
	}
	
	public void toMove(int move) {
		m_Move.startMoving(move);
	}
}