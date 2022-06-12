package remoteContralPackage;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan; 
	int prevSpeed; 

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
	  this.ceilingFan = ceilingFan;
	}

	@Override
	public void Execute() {
	 prevSpeed = ceilingFan.getSpeed();
	 ceilingFan.off();
		
	}

	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.OFF) { 
			ceilingFan.off(); 
		} else if(prevSpeed == CeilingFan.HIGH) { 
			ceilingFan.high();		
		}else if(prevSpeed == CeilingFan.MEDIUM) { 
			ceilingFan.medium();
		}else if(prevSpeed == CeilingFan.LOW) { 
		ceilingFan.low();


		}
	}
}
