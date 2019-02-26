package inheritance.example;

public abstract class CommonClass//any class ith abstract method is called abstract class

{
	private String name;
	private int age;
	private int id;
	
	//if we want to force a class to display method abstract keyword is used:
	
	public abstract void write();//method declaration /anymethod which is declared
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
