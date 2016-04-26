package legorobot;
/**
 * @author Lauren
 * @version 1.0
 * @created 20-Apr-2016 6:10:08 PM
 * 
 * This class will ensure that keyword that are passed from the pi are actually the keyword allowed in 
 * the dialog at the current moment. If the keyword is recognized by the pi but is not part of the allowed
 * keyword, then the keyword will not be passed into legorobot.   
 *  . 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public enum ConvoState {

	START(),
	PROMPT("Leah"),
	FLYER("flyer"),
	DEPT_INFO("information"),
	GOODBYE_INFO("department", "scholarship", "degree"),
	GOODBYE_FLYER("scholarship", "degree");
	
	public List<String> keywords;
	
	private ConvoState(String... keywords){
		this.keywords = Arrays.asList(keywords);
	}
	
	public List<ConvoState> getNextStateList(){
		List<ConvoState> list = new ArrayList<>();
		switch (this) {
		case DEPT_INFO:
			list.add(GOODBYE_INFO);
			return list;
		case PROMPT:
			list.add(FLYER);
			list.add(DEPT_INFO);
			return list;
		case FLYER:
			list.add(GOODBYE_FLYER);
			return list;
		case START:
			list.add(PROMPT);
			return list;
		case GOODBYE_INFO:
			list.add(START);
			return list;
		case GOODBYE_FLYER:
			list.add(START);
			return list;
		default:
			return list;
		}
		
 
	}

	public boolean isKeywordValid(String keyword){
		return keywords.isEmpty() || keywords.contains(keyword);
	}
	
	public ConvoState transitionToNextState(String keyword){

		// By default, stay in this state
		ConvoState nextState = this;
		
		// Get next state(s)
		List<ConvoState> nextStates = this.getNextStateList();
		
		// Check entry conditions (if applicable)
		for (ConvoState s : nextStates){
			if (s.isKeywordValid(keyword)){
				nextState = s;
			}
		}
		
		return nextState;
		
	}
}


