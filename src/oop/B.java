package oop;

// child class
public class B extends A{

	String name = "Luv";
	int cash = 10000;
//	int gold = 2;
//	String phone= "Iphone";
	
	
	
	public static void main(String[] args) {
	
		// object creation
		B b = new B();

		System.out.println(b.name);
		System.out.println(b.cash);
		System.out.println(b.gold);
		System.out.println(b.phone);
		
		b.car();
		b.run();
		
	}

}
