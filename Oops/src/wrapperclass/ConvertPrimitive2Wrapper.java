package wrapperclass;

public class ConvertPrimitive2Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//converting int primitive type to wrapper class object
		int num=100;
		Integer obj=Integer.valueOf(num);
		System.out.println(num +" "+ obj);
		
		//converting wrapper class obj to primitive data type
		Character c= new Character('A');
		char a=c.charValue();
		System.out.println(c +" "+ a);

	}

}
