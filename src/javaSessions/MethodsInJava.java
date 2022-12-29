package javaSessions;

import java.util.ArrayList;

public class MethodsInJava {

	public static void main(String[] args) {
		
		MethodsInJava obj=new MethodsInJava();
		
		obj.m1();
		
		obj.test();
		
	}
	
	//Method/Function: inside this method we will write logic
	
	//method is the collection of instuctions
	
	//We can call method using Object name in main method
	
	//Duplicate methods are not allowed
	
	//We can't create method inside the method
	
	//we can call methods from diff methods
	
	public void m1() {
		System.out.println("Testing");
		m2();
	}
	
	public void m2() {
		System.out.println("Manual Testing");
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		
		numbers.add(560);
		numbers.add(45);
		numbers.add(67);
		numbers.add(12);
		numbers.add(870);
		numbers.add(-2);
		numbers.add(54);
		numbers.add(-45);
		numbers.add(432);
		
		//output= -45, -2, 12,45,54,67,432.560,870
		//output= 870
	}
	
	//Assighment
	
	//No return no input
	public void test() {
		System.out.println("Automation Testing");
	}
	
	
	

	

}
