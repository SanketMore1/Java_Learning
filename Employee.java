package oop;

public class Employee {

	
	// name, id , company, salary
	
	String name ; // null
	int id;       // 0
	String company;   // null
	int salary;      // 0
	
	Employee(){
		
	}
	
	// Parameterized constructor
	
	Employee(int id, String name, String company, int salary){
		this.id = id;
		this.name = name;
		this.company = company;
		this.salary = salary;
		
	}
	
	Employee(int id,String company){
		this.id= id;
		this.company=company;
	}
	
	public static void main(String[] args) {
		
		// object creation
		
		// JVM = Java Virtualization Machine
	
		// using default constructor
		
//		Employee emp = new Employee();
//		
////		emp.name = "Amit";
////		emp.company= "Capgemini";
////		emp.id= 108;
////		emp.salary = 500000;
		
		// using parameterized constructor
		
//		Employee emp = new Employee(102,"Ram","Global science", 100000);
//		
//		System.out.println(emp.name);
//		System.out.println(emp.id);
//		System.out.println(emp.company);
//		System.out.println(emp.salary);
		
		Employee emp = new Employee(103,"Paytm");
		System.out.println(emp.name);
		System.out.println(emp.id);
		System.out.println(emp.company);
		System.out.println(emp.salary);
	
	}

}
