package test;
import java.util.Scanner ; 
import java.util.ArrayList ; 





public class FibonacciSeries {
	
	public static ArrayList<Integer> series(int n){
		ArrayList<Integer>arr = new ArrayList<Integer>();
		for(int i = 0 ; i< n ;i++) {
			arr.add(fib(i));
		}
		return arr ;
	}
	
	public static int fib(int n ) {
		if(n==0) {
			return 0 ; 
		}
		if(n==1) {
			return 1 ; 
		}
		
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr = series(n);
		
		System.out.println(arr);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
