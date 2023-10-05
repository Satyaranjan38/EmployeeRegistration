package test;

import java.util.Scanner ; 

public class AddingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number");
		int a = sc.nextInt();
		
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		
		int c = a+b ; 
		System.out.println("Sum of those number is " + c );

	}

}
