package test;

abstract class bike{
	abstract void run();
}

abstract class car{
	abstract void run();
}

class Hero extends bike{
	void run() {
		System.out.println("Hero bike is running");
	}
}

class suzuki extends car{
	void run () {
		System.out.println("Maruti suzuki is running");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bike bk = new Hero();
		bk.run();
		
		car cr = new suzuki();
		cr.run();

	}

}
