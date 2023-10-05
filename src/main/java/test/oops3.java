package test;

class Addition{
	int sum (int a , int b ) {
		return a+b ; 
	}
	int sum(int a , int b ,int c) {
		return a+b+c;
	}
	int sum (int a ,int b , int c , int d ) {
		return a+b+c+d;
	}
}

public class oops3 {

	public static void main(String[] args) {
		Addition ad = new Addition();
		
		int ans1=ad.sum(2, 3);
		int ans2 = ad.sum(2, 3,4);
		int ans3 = ad.sum(2, 3,4,5);
		
		System.out.println(ans1+" "+ans2+" "+ans3); 
	}
}
