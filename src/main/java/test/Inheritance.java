package test;


class school {
	
	public void sName () {
		System.out.println("School name is dps");
	}
	
}

class student3 extends school{
	private String name ;
	private int age ;
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
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		
	}
	
	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student3 st3 = new student3();
		
		st3.setAge(23);
		st3.setName("Satya");
		
		st3.sName();
		st3.display();
		
	}

}
