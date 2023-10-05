package test;
import java.util.Scanner ; 

public class factorial {
	
	public static int fat(int n ) {
		if (n==0) {
			return 1;
			
		}
		if(n==1) {
			return 1 ; 
		}
		
		return n*fat(n-1); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter a number");
		int n = sc.nextInt(); 
		
		int ans = fat(n); 
		System.out.println("Factorial is : "+ ans  );
		
		
		

	}

}
