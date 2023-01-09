package abstraction;

public abstract class Shape {
	
	public Shape() {
		System.out.println("This is constructor");
	}
	

	abstract void draw();
	
	
	public void changeGear() {
		System.out.println("Change gear");
	}
	
	public static void test() {
		System.out.println("this is static method");
	}
}
