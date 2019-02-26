package methodoverriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ABC obj1=new ABC();/* When Parent class reference refers to the parent class object
 					* then in this case overridden method (the method of parent class)
 						*  is called.
 						*/
obj1.disp();

ABC obj2=new Demo();/* When parent class reference refers to the child class object
 					* then the overriding method (method of child class) is called.
 						* This is called dynamic method dispatch and runtime polymorphism
 						*/
obj2.disp();
obj2.newMethod();
/*In dynamic method dispatch the object can call the overriding methods of child class and all the non-overridden methods of base class
 *  but it cannot call the methods which are newly declared in the child class.
 *  In the above example the object obj2 is calling the disp(). However if you try to call the newMeth
 */


	
	
	}
	
	

}
