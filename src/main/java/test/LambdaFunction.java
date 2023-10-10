package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LambdaFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mp = new HashMap<Integer,String>();
		
		mp.put(1,"Satya");
		mp.put(2,"Gowtham");
		mp.put(3,"Parth");
		mp.put(4,"vamsi");
		
		String name = "Satya";
		
		
		for(Map.Entry<Integer,String> entry : mp.entrySet()) {
			if(name==entry.getValue()) {
				System.out.println("Satya id is "+entry.getKey());
			}
		}
		
		Map<Integer,Integer> map = new HashMap<Integer ,Integer>();
		
		List<Integer>list = new ArrayList<Integer>();
		
		for(int i = 0 ; i< 100 ; i++) {
			list.add(i);
		}
		
		for(int i = 0 ; i< 100 ;i++) {
			map.put(i,i+1);
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());
		}
		
		
		
		
		
		

	}

}
