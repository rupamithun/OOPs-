package abstractclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank obj1=new ICICI();
obj1.deposit();
obj1.withDraw();
obj1.calculateInterest();

Bank obj2=new HDFC();
obj2.calculateInterest();
obj2.deposit();
obj2.withDraw();
	}

}
