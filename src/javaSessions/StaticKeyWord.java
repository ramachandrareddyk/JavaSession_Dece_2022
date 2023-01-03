package javaSessions;

public class StaticKeyWord {
	
	//Static keyword we will use to memory management
	//Variables
	//Methods
	//Block
	//Nested class
	
	//Static variables we can diclare in only class leval out side the method
	
	//1.to call static methods and variables in same class dairectly we can call
	
	//2.We can call using class name
	
	//3.We can call using Object
	
	static int a=100;
	
	int b=200;

	public static void main(String[] args) {
		StaticKeyWord ss= new StaticKeyWord();
		
		ss.m1();
		System.out.println(ss.b);
		//direct call
		/*
		 * test();
		 * 
		 * System.out.println(a);
		 */
		
		//call using class name
		/*
		 * System.out.println(StaticKeyWord.a); StaticKeyWord.test();
		 */
		
		ss.test();
		System.out.println(ss.a);
		
		

	}
	
	public void m1() {
		int x=100;
	//	static int y=200;
		
		System.out.println("this is non static method");
	}
	
	public static void test() {
		System.out.println("This is static method");
	}

}
