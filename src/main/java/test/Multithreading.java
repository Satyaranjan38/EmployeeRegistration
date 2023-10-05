package test;


class multithreadingdemo extends Thread{
	
	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getId() + "is running");
		}
		catch(Exception e ) {
			System.out.println("Exception is caught "); 
		}
	}
}
public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i <10 ;i++) {
			multithreadingdemo th = new multithreadingdemo();
			th.start();
		}
		
		
	
		

	}

}
