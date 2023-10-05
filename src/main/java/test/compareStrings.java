package test;
import java.util.Scanner ; 
public class compareStrings {
	
	public static boolean com(String a , String b ) {
		for(int i = 0 ; i< a.length() ; i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				return false ; 
			}
		}
		return true ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first string");
		String a = sc.next();
		
		System.out.println("Enter second string");
		String b = sc.next();
		
	if (com(a,b)) {
		System.out.println("String is same ");
	}
	else {
		System.out.println("String is different");
	}

	}

}
