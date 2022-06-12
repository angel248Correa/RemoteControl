package remoteContralPackage;

public class MacroCommand  implements Command{
	
	Command[] commands; 
	
	public MacroCommand(Command[] commands) { 
		 this.commands = commands; 
	}
	

	public void Execute() {
	 for (int i = 0; i < commands.length; i++) { 
		 commands[i].Execute();
	 }
		
	}


	@Override
	public void undo() {
		 for (int i = 0;  i < commands.length; i++) { 
			 commands[i].Execute();
		 }
		
	}

}
