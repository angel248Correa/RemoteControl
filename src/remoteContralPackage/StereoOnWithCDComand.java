package remoteContralPackage;

public class StereoOnWithCDComand implements Command {
	Stereo stereo; 
	
	public StereoOnWithCDComand(Light light) { 
		this.stereo = stereo; 
		
	}

	public StereoOnWithCDComand(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Execute() {
		stereo.on();
		stereo.setCD(); 
		stereo.setVolume();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
