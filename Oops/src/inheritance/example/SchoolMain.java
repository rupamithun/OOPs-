package inheritance.example;

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud=new Student();
		stud.setAge(14);
		stud.setId(01);
		stud.setName("Java");
		stud.setMarks(700);
		System.out.println("Name of the student is "+stud.getName());
		stud.percentageValue();
		stud.write();
		
		Teacher emplo=new Teacher();
		emplo.setAge(23);
		emplo.setSalary(20000);
		emplo.setName("Java Teacher");
		System.out.println( "Employee name is "+emplo.getName());
		emplo.annualSalary();
		emplo.write();
	}

}
