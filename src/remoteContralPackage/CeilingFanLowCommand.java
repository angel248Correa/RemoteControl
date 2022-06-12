package remoteContralPackage;

public class CeilingFanLowCommand implements Command {
  CeilingFan ceilingFan; 
   int prevSpeed; 
	
  
	 public CeilingFanLowCommand(CeilingFan ceilingFan) { 
	   this.ceilingFan = ceilingFan; 
   }
	public void Execute() {
		prevSpeed = ceilingFan.getSpeed(); 
			
	}

	@Override
	public void undo() {
  if(prevSpeed == ceilingFan.LOW) {
	  ceilingFan.low(); 
  } else if(prevSpeed == CeilingFan.OFF) { 
	  ceilingFan.off();  
  } else if(prevSpeed == ceilingFan.HIGH) { 
	  ceilingFan.high(); 
  }else if(prevSpeed == ceilingFan.MEDIUM) { 
	  ceilingFan.medium(); 
  }
		
	}

}
