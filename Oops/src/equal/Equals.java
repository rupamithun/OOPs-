package equal;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String s1=new String("A");
			String s2=new String("A");
			
			if(s1==s2)
			{
				System.out.println("ref are equal");
			}
			if(s1.equals(s2))
			{
				System.out.println("has same objects or attribute value");
			}
			String s3="b";
			String s4="b";
			if(s3==s4)
			{
				System.out.println("ref are equal");
			}
			if(s3.equals(s4))
			{
				System.out.println("has same objects or attribute value");
			}
			
			

	}

}
