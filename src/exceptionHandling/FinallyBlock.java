package exceptionHandling;

public class FinallyBlock {
	
	//if you to execute mandatory things we have to use finally block

	public static void main(String[] args) {
		try {
			System.out.println(9/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Bye...");
		}
		int x=getnum("Tom");
		System.out.println(x);
	}
	//Get data from data base
	
	//We connect with data base   --> Server, DB Name, Username, Password
	
	//SQl Quaries to get the data   Exception
	
	//Close DB Connectin
	public static int getnum(String name) {
		if(name.equals("Tom")) {
		try {
			int marks=90/2;
			return marks;
		} catch (ArithmeticException e) {
			return 10;
		} finally {
			return 20;
		}
	} else if(name.equals("Ravi")) {
		return 100;
	}else {
		return 50;
	}
		
	}
	
	

}
