package test;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,-10,1,3,-20} ; 
		
		int n = 5 ; 
		
		Set<Integer> number = new HashSet<Integer>();
		
		
		for(int i = 0 ; i< n ;i++) {
			number.add(arr[i]);
		}
		
	
	}

}
