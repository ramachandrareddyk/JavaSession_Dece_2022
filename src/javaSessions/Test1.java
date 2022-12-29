package javaSessions;

public class Test1 {

	public static void main(String[] args) {
		Test t= new Test();
		t.m1();
		t.m2();
		
		Test1 t1= new Test1();
		
		t1.hello();
		t1.Bye();
		

	}
	
	public void hello() {
		System.out.println("Hello Testing");
	}
	public void Bye() {
		System.out.println("Bye Testing");
	}

}
