package equal;

public class intern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a1=new String("DDD");//refer to object in heap area
String a2=a1.intern();//intern() refers to object in string contant pool
System.out.println(a1==a2);

System.out.println(a1.equals(a2));
String a3="DDD";
System.out.println(a3.equals(a2));
System.out.println(a3==a2);
	}

}
