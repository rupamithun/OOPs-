package encapsulation.example;

public class Teacher {
	private int empID;
	private int salary;
	private int empage;
	private String empName;
	
	//ENCALPSULATION---binding objects in methods and access restriction to variables value by assigning each variable as private
	
	public int getEmpID() {
		return empID;
	}



	public void setEmpID(int empID) {
		this.empID = empID;
	}



	public int getEmpage() {
		return empage;
	}



	public void setEmpage(int empage) {
		this.empage = empage;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getSalary()
	{
		return(salary*2);
		
	}
	
	

}
