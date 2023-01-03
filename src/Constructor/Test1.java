package Constructor;

public class Test1 {
	//Constructor
	
	public Test1() {
		System.out.println("Default constructor");
	}
	
	public Test1(String s) {
		System.out.println("Paremetarized constructor");
	}
	
	
	
	public static void main(String[] args) {
		Test1 t= new Test1();
		
		Test1 t2= new Test1("testing");

	}

}
