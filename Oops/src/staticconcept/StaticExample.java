package staticconcept;

public class StaticExample {
	public static void myMethod()
	{
		System.out.println("Static variable cane be accessed by both static and nonstatic methods");
	}
static
{
	System.out.println("block");
	
}
int a=10;
static int b=20;
public void methodOne()
{
	System.out.println("Non-static method");
	System.out.println(a+b);
}
public static void methodTWo()
{
	System.out.println("Static MEthod");
	System.out.println(b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	myMethod();
	StaticExample s1=new StaticExample();
	StaticExample s2=new StaticExample();
	s1.a=100;
	s1.b=200;
	/*static variables can be accessed directly without
	 * any instances. Just to demonstrate that static variables
	 * are shared, I am accessing them using objects so that 
	 * we can check that the changes made to static variables
	 * by one object, reflects when we access them using other
	 * objects
	 */
	s2.a=1000;
	s2.b=2000;
	
	System.out.println("a="+s1.a);
	System.out.println("b="+s1.b);
	System.out.println("a="+s2.a);
	System.out.println("b="+s2.b);
	
	
	
	}

	
}
