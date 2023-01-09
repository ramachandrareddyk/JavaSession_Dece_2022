package interfaceConcept;

public class MultiImplemetation implements Printable,Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw() {
	System.out.println("Draw from Shape interface");
		
	}

	@Override
	public void print() {
		System.out.println("Print drom printable interface");
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	

}
