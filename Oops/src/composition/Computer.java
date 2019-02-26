package composition;

public class Computer {
	private OperatingSystem os=new OperatingSystem();
	private Powersupply ps=new Powersupply();
	
	public Computer()
	
	{
		ps.turnOn();
		os.bootUp();
		
		
	}
	public void allDone()
	{
		ps.turnOff();
		os.bootDown();
	}

}
