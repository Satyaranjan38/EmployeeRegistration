package test;

 class Arithmetic{
	 int add(int a , int b ) {
		int c = a+b ; 
		System.out.println(a);
		System.out.println(b);
		return c ; 
	}
}
 
 class Adder extends Arithmetic{
	 
	 
 }

public class oops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder ad = new Adder();
		int ans = ad.add(2, 3);
		System.out.println(ans);
		
		
	}

}
