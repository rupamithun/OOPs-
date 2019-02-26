package composition;

public class COP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Computer comp=new Computer();
System.out.println("Browsing the internet");
System.out.println("saving some sourcecode");
comp.allDone();
comp=null;
	}

}
