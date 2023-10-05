package test;

class Student{
	private String name ;
	private int age ;
	private String school;
	private String standard ;
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	} 
	
	
	
}


public class Acessmodifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student();
		st.setAge(15);
		st.setName("Satya");
		st.setSchool("Delhi public school");
		st.setStandard("9");
		
		System.out.println("Age is :"+st.getAge() + "Name is :"+st.getName()+"School name is :"+
				st.getSchool()+"Standard is :"+st.getStandard());
		

	}

}
