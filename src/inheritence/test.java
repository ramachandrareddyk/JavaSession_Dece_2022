package inheritence;

import AccessModifires.A;

public class test extends A{
	
	//inheritence is a mechanism in which one opbject acquires all properties and behavier of parent class,
	
	//Extending parent class properties to chaild class that is called as inheritence
	
	
	//to achive Method Overriding concept
	//fcor code reusability
	
	//Class:
	//ParentClass/SuperClass:
	//ChildClass/SubClass
	//Extend Key word
	
	public static void main(String[] args) {
		A a= new A();
		
		//a.m1();
		
		
		test t= new test();
		
		t.m3();
	}
	
	

}
