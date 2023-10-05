package test;

 class Animal{
	
	public void walk() {
		System.out.println("I am walking");
	}
}
 
class Bird extends Animal{
	public void fly() {
		System.out.println("I can fly ");
	}
	
	public void sing() {
		System.out.println("I can sing");
	}
}



public class oops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird bird = new Bird();
		bird.fly();
		bird.walk();
		bird.sing();
	}

}
