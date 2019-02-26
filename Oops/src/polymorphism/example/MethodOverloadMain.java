package polymorphism.example;

public class MethodOverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading addition=new MethodOverloading();
		
		addition.add(2, "HI");
		System.out.println("add1="+addition.add(2, 3));
		System.out.println("add2="+addition.add(3, 4, 5));

	}

}
