package aggregation;

public class agg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseOperation click=new MouseOperation();
		Comp c=new Comp(click);
		System.out.println("starting program execution");
		click.leftClick();
		c.otherStuff();
		c=null;
		click.rightClick();
		
		
		

	}

}
