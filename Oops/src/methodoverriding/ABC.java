package methodoverriding;//DYNAMIC DISPATCH METHOD

public class ABC {
	public void disp()
	{
		System.out.println("disp() of mainclass");
		
	}
	public void newMethod()
	{
		System.out.println("another method of mainclass");
	
	}
}

class Demo extends ABC
{
	public void disp() {
		System.out.println("disp() of subclass");
	}
	public void helo()
	{
		System.out.println("subclass method");
	}
}
