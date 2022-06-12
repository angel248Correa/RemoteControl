package remoteContralPackage;

public class RemoteControlParty implements Command  {
	Light light = new Light("Living Room");
	 TV tv = new TV("Living Room");
	 Stereo stereo = new Stereo("Livging Room");
	 Hottub hottub = new Hottub();
	 
	 LightOnCommand lightOn  = new LightOnCommand(light);
	 StereoOnCommand stereoOn = new StereoOnCommand(stereo); 
	 TVOnCommand tvOn = new TVOnCommand();
	 HotTubOnCommand hotTubOn = new HotTubOnCommand(hottub);

	 LightOffCommand lightOff  = new LightOffCommand(light);
	 StereoOffCommand stereoOff = new StereoOffCommand(stereo); 
	 TVOnCommand tvOff = new TVOffCommand();
	 HotTubOnCommand hotTubOff = new HotTubOffCommand(hottub);
	 
	 
	 Command[] partyOn = {lightOn, stereoOn, tvOn, hotTubOn};
	 Command[] partyoff = {lightOff, stereoOff, tvOn, hotTubOff };  
	 
	 MacroCommand partyOnMacro = new MacroCommand(partyOn);
	 MacroCommand partyOffMacro = new MacroCommand(partyoff);
	 
	 remoteControlParty.setCommand(0, partyOnMacro, partyOffMacro);
	 
	 
    system.out.println(remoteControl);
    system.out.println("----Pushing  Macro On---"); 
    remoteControl.onButtonWasPushed(0); 
    system.out.println("------ Pushig Macro Off---");
    remoteControl.OffButtonWasPushed(0);


	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	 
	
}
