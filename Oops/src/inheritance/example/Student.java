package inheritance.example;

public class Student extends CommonClass
{
private int marks;
private int percentage;
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public void percentageValue()
{
	percentage=marks*100;
	System.out.println("percentage=" +percentage);
	
}
	
	  public void write() 
	  {
		  System.out.println("student");
	  }
	 

}
