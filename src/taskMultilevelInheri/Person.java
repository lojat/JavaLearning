package taskMultilevelInheri;

public class Person {
	
	protected String name;
	private int age;
	
	public void display() {
		System.out.println("Person Name= "+name+" Age= "+age);
	}
	
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
	



}
