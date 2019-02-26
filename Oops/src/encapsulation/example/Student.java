package encapsulation.example;

public class Student {
	private int studentID;
	private int mark;
	private String studentName;
	private int studentAge;
//encapsulation


public int getStudentID() {
		return studentID;
	}



	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}



	public int getMark() {
		return mark;
	}



	public void setMark(int mark) {
		this.mark = mark;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public int getStudentAge() {
		return studentAge;
	}



	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}



public int getPercentage()
{
	return(mark*10);
}
}
