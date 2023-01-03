package MethodOverRiding;

public class Vehicle {

	public void run() {
		System.out.println("Vehicle is running");
	}
	
	public static void speed() {
		System.out.println("Vehicle speed");
	}
	
	final void test() {
		System.out.println("Vehicle test");
	}
	
	private void m1() {
		System.out.println("Vehicle m1");
	}
}
