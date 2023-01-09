package exceptionHandling;

public class ThrowsKeyword {

	
	//Passing the Exeception one method to another method
	
	//if user passing the exception in main method JVM is going handle the exception
	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub

		ThrowsKeyword th= new ThrowsKeyword();
		th.m1();
	}
	
	public void m1()  {
		System.out.println("This is m1");
		
		m2();
		
	}
	public void m2() throws ArithmeticException{
		System.out.println("This is m2");
		m3();
	}
	public void m3() throws ArithmeticException{
		System.out.println("This is m3");
		m4();
	}
	public void m4() throws ArithmeticException{
		System.out.println("This is m4");
		System.out.println(9/0);//arithimatic exception
	}

}
