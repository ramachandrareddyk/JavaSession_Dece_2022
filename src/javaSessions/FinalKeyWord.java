package javaSessions;

public class FinalKeyWord {
	//final key word we will use to restrict the access/user
	
	//Variables
	//Methods
	//class
	
	//using final keyword method overloading is possible
	//Method overriding is not possible
	
	//if diclare class as a final we can't extend thet class

	
	
	public static void main(String[] args) {

		int a=100;
		String s="Testing";
		
		a=300;
		
		s="Manual Testing";
		
		final int b=24;
		
		//b=30;


	}
	
	final void run()
	{
		System.out.println("Running safely");
	}
	
	void run(String bike) {
		
	}
}
