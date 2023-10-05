package test;


class operation{
	
	public int opp(int a , int b ) {
		return a* b ;
	}
	
	public int opp(int a , int b , int c) {
		return a*b+c ;
	}
	
	public int opp(int a , int b ,int c ,int d) {
		return (a+b) * (c+d);
	}
	
}
public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		operation op = new operation();
		
		int a = op.opp(1, 2);
		int b = op.opp(1, 2,3);
		int c = op.opp(1, 2,3,4);
		
		System.out.println(a+" "+ b +" "+ c);
	}

}
