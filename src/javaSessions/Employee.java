package javaSessions;

public class Employee {
	
	//1. Class
			//2. Object
			//3. Inheritence
			//4. Polymarphisam
			//5. Encapsulation
			//6. Abstraction
					//1. Abstract class
					//2. Interface
			
			//class: class is a group of objects which have comman properties 
			// class is the templete or blueprint which objects are created
			
			//Variables
			//Methods
			//constructors
			//blocks
			//nested classes
	
	
	//2. Object: Object is an instence of class
	//we have to create the object using class name
	
	// we have 2 types of variables
		//1. Local variables: declare the variables inside the method
		//2. Instance variable/Global variables: Declare variables inside the class and out side the method
	
		String name;
		int age;
		double slary;
		boolean isActive;

	public static void main(String[] args) {
		
		
		int a=100;
		int b=200;
		System.out.println(a+b);
		
		Employee emp = new Employee();//RHS
		
		
		System.out.println(emp.name);System.out.println(emp.slary);
		System.out.println(emp.age);System.out.println(emp.isActive);
		
		emp.name="Peter";
		emp.age=56;
		emp.slary=45000;
		emp.isActive=true;
		System.out.println(emp.name);System.out.println(emp.slary);
		System.out.println(emp.age);System.out.println(emp.isActive);
		
		Employee emp1= new Employee();
		
		emp1.name="Stive";
		emp1.age=34;
		emp1.slary=56000;
		emp1.isActive=true;
		
		System.out.println(emp1.name);System.out.println(emp1.slary);
		System.out.println(emp1.age);System.out.println(emp1.isActive);
		
		System.out.println(emp1.name+" "+emp1.slary+" "+emp1.age+" "+emp1.isActive);
		
		Employee emp2= new Employee();
		
		emp2=null;
		emp2.name="Nelson";
		System.out.println(emp2.name);//java.lang.NullPointerException
		
		//to cleanup the memory we have to use Garbage Collector (GC)
		
		System.gc();
		
		

	}

}
