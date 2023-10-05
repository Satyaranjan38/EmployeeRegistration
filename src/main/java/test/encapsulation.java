package test;

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 st = new Student1();
		st.setName("Satya");
		st.setAge(23);
		st.setSchool("Dps");
		st.setStandard("btech");

		System.out.println("Name is : " + st.getName() + "Age is : " + st.getAge() + "School name " + st.getSchool()
				+ "Standard is " + st.getStandard());

	}

}
