package MethodOverRiding;

public class Bike extends Vehicle{

	public static void main(String[] args) {
		Bike b= new Bike();
		b.run();
		
		Vehicle v= new Vehicle();
		v.run();

	}
	@Override
	public void run() {
		System.out.println("Bike is running");
	}
	//static method
	/*
	 * public void speed() { System.out.println("test"); }
	 */
	//final method
	/*
	 * public void test() { System.out.println(); }
	 */
	/*private method
	 * @Override private void m1() {
	 * 
	 * }
	 */

}
