package polymorphism.example;

/*Method Overloading is a feature that allows a class to have more than one method having the same name, 
 * if their argument lists are different. It is similar to constructor overloading in Java, t
 *that allows a class to have more than one constructor having different argument lists.
*/
public class MethodOverloading {
	public int add(int n1,int n2)
	{
		return(n1+n2);
	}
	public int add(int n1,int n2,int n3)
	{
		return(n1+n2+n3);
		
	}
	public void add(int n1, String c)
	{
		System.out.println(+n1   +c);
	}
}
