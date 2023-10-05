package test;
import java.util.* ; 

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String>ll1 = new LinkedList<String>();
		
		ll1.add("Satya");
		ll1.add("ranjan");
		ll1.add("Parida");
		int n = ll1.size();
		
		for(int i = 0 ; i< n ;i++) {
			System.out.println(ll1.get(i));
		}
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		
		hm.put(1,"Satya");
		hm.put(2,"ranjan");
		hm.put(3, "Parida");
		
		
		System.out.println(hm.get(1));
		System.out.println(hm);
		
		
		if(hm.containsKey(1)) {
			String a = hm.get(1);
			System.out.println(a);
		}
		
		Set<Integer> s = new HashSet<Integer>();
		int size = 10000 ;  
		for(int i = 0 ; i< size ; i++ ) {
			s.add(i);
		}
		
		System.out.println(s);
		
		
		

	}

}
