package oop;

// child class
public class Customer extends Seller{

	String store_name = "Laxmi Mart";
	
	
//	void hello() {
//		System.out.println("I buy products");
//	}
//	
	public static void main(String[] args) {
	
		
		// object creation
		Customer c = new Customer();
		
		c.hello();
		
		
	}

}
