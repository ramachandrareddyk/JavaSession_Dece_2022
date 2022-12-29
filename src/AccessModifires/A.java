package AccessModifires;

public class A {
	
	//we have 4 access modifires in java
	
	//1. Default
	//2. Private
	//3. Ptected
	//4. public
	
	int a=100;
	
	private int b=200;
	
	//1. Default- We can able to access inside the class,out side the class in same package, Out side the package we can't ableto access
	//2. Private-We can able to access only inside the class
	//3. protected - We can able to access inside the class, Out side the class in same package, Outside the package this class should be parent
	//4. public - We can access anyware in project

	void m1() {
		System.out.println("this is default method");
	}
	
	private void m2() {
		System.out.println("This is private method");
	}
	
	protected void m3() {
		System.out.println("This is protected methos");
	}
	
	
	public static void main(String[] args) {
		A a= new A();
		a.m1();
		a.m2();
		a.m3();
		
	}
	
}
