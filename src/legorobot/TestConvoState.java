package legorobot;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author Lauren
 * @version 1.0
 * @created 20-Apr-2016 11:10:08 PM
 * 
 * This class tests all edges of the conversation tree. This ensures that all elements do work and that the 
 * user would not be able to confuse the program by saying keyword that aren't recognized within that tree
 * level.   
 *  
 */

public class TestConvoState {

	@Test
	//This test ensure that the keyword path lea --> flyer --> department does not work. The keyword department 
	//should not be recognized if the path is currently in flyer 
	public void testFlyerDepartment() {

		ConvoState curState = ConvoState.START;

		// Test going to prompt
		curState = curState.transitionToNextState("Leah");
		assertEquals(ConvoState.PROMPT, curState);

		// Go to flyer
		curState = curState.transitionToNextState("flyer");
		assertEquals(ConvoState.FLYER, curState);
		
		// Make sure we can't go to dept from flyer
		curState = curState.transitionToNextState("department");
		assertEquals(ConvoState.FLYER, curState);
		
	}
	

	@Test
	//This test ensure that the keyword path lea --> flyer --> degree does work
	public void testFlyerDegree() {

		ConvoState curState = ConvoState.START;

		// Test going to prompt
		curState = curState.transitionToNextState("Leah");
		assertEquals(ConvoState.PROMPT, curState);

		// Go to flyer
		curState = curState.transitionToNextState("flyer");
		assertEquals(ConvoState.FLYER, curState);
		
		// Go to goodbye flyer
		curState = curState.transitionToNextState("degree");
		assertEquals(ConvoState.GOODBYE_FLYER, curState);
		
		// Go to start
		curState = curState.transitionToNextState(null);
		assertEquals(ConvoState.START, curState);
	}
	
	@Test
	//This test ensure that the keyword path lea --> flyer --> scholarship does work
		public void testFlyerScholarship() {

			ConvoState curState = ConvoState.START;

			// Test going to prompt
			curState = curState.transitionToNextState("Leah");
			assertEquals(ConvoState.PROMPT, curState);

			// Go to flyer
			curState = curState.transitionToNextState("flyer");
			assertEquals(ConvoState.FLYER, curState);
			
			// Go to goodbye flyer
			curState = curState.transitionToNextState("scholarship");
			assertEquals(ConvoState.GOODBYE_FLYER, curState);
			
			// Go to start
			curState = curState.transitionToNextState(null);
			assertEquals(ConvoState.START, curState);
		}

	@Test
	//This test ensures that the keyword path lea --> information --> degree does work
		public void testInformationDegree() {
			ConvoState curState = ConvoState.START;

			// Test going to prompt
			curState = curState.transitionToNextState("Leah");
			assertEquals(ConvoState.PROMPT, curState);

			// Go to flyer
			curState = curState.transitionToNextState("information");
			assertEquals(ConvoState.DEPT_INFO, curState);
			
			// Go to goodbye flyer
			curState = curState.transitionToNextState("degree");
			assertEquals(ConvoState.GOODBYE_INFO, curState);
			
			// Go to start
			curState = curState.transitionToNextState(null);
			assertEquals(ConvoState.START, curState);
		}
	
	@Test
	//This test ensures that the keyword path lea --> information --> department does work
		public void testInformationDepartment() {
			ConvoState curState = ConvoState.START;

			// Test going to prompt
			curState = curState.transitionToNextState("Leah");
			assertEquals(ConvoState.PROMPT, curState);

			// Go to flyer
			curState = curState.transitionToNextState("information");
			assertEquals(ConvoState.DEPT_INFO, curState);
			
			// Go to goodbye flyer
			curState = curState.transitionToNextState("department");
			assertEquals(ConvoState.GOODBYE_INFO, curState);
			
			// Go to start
			curState = curState.transitionToNextState(null);
			assertEquals(ConvoState.START, curState);
		}
	
	@Test
	//This test ensures that the keyword path lea --> information --> department does work
		public void testInformationScholarship() {
			ConvoState curState = ConvoState.START;

			// Test going to prompt
			curState = curState.transitionToNextState("Leah");
			assertEquals(ConvoState.PROMPT, curState);

			// Go to flyer
			curState = curState.transitionToNextState("information");
			assertEquals(ConvoState.DEPT_INFO, curState);
			
			// Go to goodbye flyer
			curState = curState.transitionToNextState("scholarship");
			assertEquals(ConvoState.GOODBYE_INFO, curState);
			
			// Go to start
			curState = curState.transitionToNextState(null);
			assertEquals(ConvoState.START, curState);
		}
}

