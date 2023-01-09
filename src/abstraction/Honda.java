package abstraction;

public class Honda extends Bike{

	public static void main(String[] args) {
		Bike obj=new Honda();
		
		Honda h= new Honda();
		
		h.run();
		
		obj.run();

	}

	@Override
	void run() {
		System.out.println("Running safely");
	}

}
