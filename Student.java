package oop;

public class Student {

	
	
	
	String name ;   // null
	String college;  //null
	String degree;  // null
	int id;    // 0
	int age;  // 0
	boolean ispresent;  // false
	// constructor
	
	// constructor is used to intialize object / or to provide default values
	
	// # no return type
	// # constructor should have same name as class name
	
	// #1. default constructor
	Student(){
		
		
	}
//	
//	// #2. Parameterized constructor
   Student(String name,String college,String degree,int id,int age,boolean ispresent){
		this.name=name;
		this.college =college;
		this.id=id;
		this.degree = degree;
		this.age= age;
		this.ispresent = ispresent;
		
	}
   
//	// #3. Parameterized constructor
  Student(String name,int id){
		this.name=name;
	    this.id=id;
	}
	
//#3. Parameterized constructor
 Student(int id){
		
	    this.id=id;
	}
	
	
	public static void main(String[] args) {
		
		
		// Person 
		// name , age , height, weight ,location 
		
		// Student
		// name,college, degree, id/roll no
		
		// Laptop
		// Brand, Specification{ram, generation, processor,graphics card}
		
		// Employee
		// name, id, company, salary,city
		
		// class is logical diagram for any real world entity
		
		// Object
		// object is an instance of class
		
		//int a =10;
		
		// object creation
	// first student	
		Student stu = new Student();
		stu.name= "Ram";
		stu.college = "MIT";
		stu.degree ="B.E";
		stu.id= 101;    
		stu.age=27; 
		stu.ispresent = true;
//		System.out.println("Student name is : "+stu.name);
//		System.out.println("Student college is : "+stu.college);
//		System.out.println("Student degree is : "+stu.degree);
//		System.out.println("Student id is : "+stu.id);
//		System.out.println("Student age is : "+stu.age);
//		System.out.println("Student present : "+stu.ispresent);
//	
		// second student
		Student stu1 = new Student("Shyam","PRMITR","B.E",102,26,false);
	
		
		
		
//		System.out.println("Student name is : "+stu1.name);
//		System.out.println("Student college is : "+stu1.college);
//		System.out.println("Student degree is : "+stu1.degree);
//		System.out.println("Student id is : "+stu1.id);
//		System.out.println("Student age is : "+stu1.age);
//		System.out.println("Student present : "+stu1.ispresent);
//	

		// third student
		
//		Student stu2 = new Student("Krishna",103);
//		System.out.println("Student name is : "+stu2.name);
//		System.out.println("Student college is : "+stu2.college);
//		System.out.println("Student degree is : "+stu2.degree);
//		System.out.println("Student id is : "+stu2.id);
//		System.out.println("Student age is : "+stu2.age);
//		System.out.println("Student present : "+stu2.ispresent);
//	
		
		// fourth student
		Student st = new Student(103);
		System.out.println("Student name is : "+st.name);
		System.out.println("Student college is : "+st.college);
		System.out.println("Student degree is : "+st.degree);
		System.out.println("Student id is : "+st.id);
		System.out.println("Student age is : "+st.age);
		System.out.println("Student present : "+st.ispresent);
	
		
	}

}
