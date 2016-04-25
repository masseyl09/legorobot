package legorobot;

/**
 * @author Jess
 * @version 1.0
 * @created 06-Feb-2016 3:10:08 PM
 * 
 * This class starts everything by initializing the robot and running.
 */

public class LegoRobot {
	public static void main(String[] args) {
		
		// Create instances
		Robot robot = new Robot();
		robot.m_Move = new Move();
		robot.m_Hear = new Hear();
		robot.m_Speak = new Speak();
		robot.m_RobotInteract = new RobotInteract(robot);
		
		// Begin program logic
		robot.run();
	}
}