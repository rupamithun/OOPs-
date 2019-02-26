package inheritance.example;

public class Teacher extends CommonClass
{
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void annualSalary()
	{
		int annualsalary=salary*200;
		System.out.println("Annualsalary="+annualsalary);
		
	}
	public void write()
	{
		System.out.println("teachers");
	}

}
