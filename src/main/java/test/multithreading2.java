package test;


class threading extends Thread{
	public void run() {
		try {
			System.out.println("I am thread 1 ");
		}
		catch(Exception e) {
			System.out.println("Exception at th1");
		}
	}
	
}
class threading2 extends Thread{
	
	public void run() {
		try {
			System.out.println("I am thread 2");
		}
		catch(Exception e ){
			System.out.println("Exception at th2 ");
		}
	}
	
}

class threading3 extends Thread{
	
	public void run() {
		try {
			System.out.println("I am thread 3");
		}
		catch(Exception e ) {
			System.out.println("Exception at th3");
		}
	}
	
}
public class multithreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		threading th1 = new threading();
		threading2 th2 = new threading2();
		threading3 th3 = new threading3();
		th1.start();
		th2.start();
		th3.start();
	}

}
