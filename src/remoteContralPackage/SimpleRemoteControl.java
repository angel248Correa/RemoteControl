package remoteContralPackage;

public class SimpleRemoteControl {
	Command slot; 
	
	public SimpleRemoteControl() { }
	
	public void setCommand(Command command) { 
		slot = command; 
	}
	public void ButtonWasPressed() { 
		slot.Execute();
	}

}
