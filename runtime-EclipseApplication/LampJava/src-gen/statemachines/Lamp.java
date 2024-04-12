
package statemachines;

public class Lamp {
	 int counter = 0; 

	private State state = State.Off;
	
	public void Flick() {
		var nextState = state;
		switch (state){
		case Off:
			
			nextState = State.On;
			break;
		case On:
			
			nextState = State.Off;
			break;
		default:
			throw new IllegalStateException(state.toString());
		}
		if (nextState != state){
			switch (state){
			case On:
				exitOn();
				break;
			
			}
			state=nextState;
			switch (nextState) {
			case On:
				enterOn();
				break;
			}
			
			
		}
		
}


private void enterOn() {
	
	System.out.println("Turning on...");
	System.out.println("Turned on counter  times.");
}
private void exitOn() {
	
	System.out.println("Turning off...");
}

private enum State{
	Off, On
	}

}

