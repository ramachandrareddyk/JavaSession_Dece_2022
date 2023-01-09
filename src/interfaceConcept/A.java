package interfaceConcept;

public class A implements Printable{

	@Override
	public void print() {
	System.out.println("Hello");
		
	}

	@Override
	public void test() {
		System.out.println("Hello testing");
		
	}
	
	public static void main(String[] args) {
		A a= new A();
		a.test();
		a.print();
		
		
		Printable pr= new A();
		
		pr.print();
		
		pr.test();
	}

}
