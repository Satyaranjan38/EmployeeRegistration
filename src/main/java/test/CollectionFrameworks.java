package test;

import java.util.ArrayList; 

public class CollectionFrameworks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		//System.out.println(arr.isEmpty());
		//System.out.println(arr.contains(1));
		//System.out.println(arr.indexOf(5));
		//Object[] arr1 = arr.toArray();
		
		//for(Object obj : arr1) {
			//System.out.println(obj);
		//}
		
		//System.out.println(arr.get(3));
		//arr.set(1, 1);
		
		//System.out.println(arr.indexOf(1));
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		
		arr.addAll(list);
		System.out.println(arr);
		

	}

}
