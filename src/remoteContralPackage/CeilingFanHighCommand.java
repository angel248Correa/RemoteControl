package remoteContralPackage;

public class CeilingFanHighCommand implements Command{
	CeilingFan ceilingFan; 
	int prevSpeed; 

	public  void CeilingfanHighCommand(CeilingFan ceilingFan) { 
		this.ceilingFan = ceilingFan; 
	}
	
	@Override
	public void Execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high(); 
		
	}

	@Override
	public void undo() {
		if(prevSpeed == ceilingFan.HIGH) { 
			ceilingFan.high();
		} else if(prevSpeed == ceilingFan.MEDIUM) { 
			ceilingFan.medium();
		}else if(prevSpeed == ceilingFan.LOW) { 
			ceilingFan.low();
		}else if(prevSpeed == ceilingFan.OFF) { 
			ceilingFan.off();
		}
		
		
	}

}
