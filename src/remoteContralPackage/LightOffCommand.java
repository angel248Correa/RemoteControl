package remoteContralPackage;

public class LightOffCommand implements Command {
	
Light light; 
	
	public LightOffCommand(Light livingRoomLight) {
	// TODO Auto-generated constructor stub
}

	public void LightOnCommand(Light light) { 
		this.light = light; 
	}

	public void Execute() {
		light.off();
		
	}
public void undo() { 
	light.on();
}
}
