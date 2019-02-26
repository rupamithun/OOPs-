package encapsulation.example;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud=new Student();
		stud.setStudentAge(16);
		stud.setMark(700);
		stud.setStudentName("Java");
		stud.setStudentID(04);
		System.out.println("Name is "+stud.getStudentName());
		double percentage= stud.getPercentage();
		System.out.println("Percentage="+percentage);
		
		
		Teacher emplo=new Teacher();
		emplo.setEmpage(23);
		emplo.setEmpID(02);
		emplo.setEmpName("Java Teacher");
		emplo.setSalary(4000);
		
		System.out.println("Employee name is "+emplo.getEmpName());
		int annualsalary=emplo.getSalary();
		System.out.println("ASalary="+annualsalary);
		
		

	}

}
