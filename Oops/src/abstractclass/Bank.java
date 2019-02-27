package abstractclass;

public abstract class Bank {
	
	public void withDraw()
	{
		System.out.println("common withdraw method for all banks");
	}
	public void deposit()
	{
		System.out.println("common deposit method for all banks");
	}
	public abstract void calculateInterest();//ABSTRACT METHOD
}
