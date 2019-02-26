package aggregation;

public class Comp {
	private MegaOfficeSuiteDVD ms=new MegaOfficeSuiteDVD();//composition
	private OperatingSystem oss=new OperatingSystem();//composition
	private Keyboard ky=new Keyboard();
	private MouseOperation click;//reference only ;aggregation
	public Comp(MouseOperation click)
	{
		this.click=click;
		oss.bootUp();
	}
	
public void otherStuff()
{
	ms.install();
	ms.viewshinnySurface();
	click.rightClick();
	System.out.println("Power supply is essential for the computer to perform");
}
}
