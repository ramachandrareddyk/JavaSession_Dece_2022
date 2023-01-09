package exceptionHandling;

public class TrychatchBlocks {

	String name;
	public static void main(String[] args) {
		
		
		//Exception is the parent calss for all the exception
		//throwable is the parent class for the Exception
		
		// we can write one try block with multiple catch blocks
		
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");
		TrychatchBlocks tc= new TrychatchBlocks();
		
		tc=null;
		
		
		try {
		//System.out.println(9/0);
		tc.name="tom";
		
		}catch(ArithmeticException e) {
			//e.printStackTrace();
		} catch (NullPointerException e) {
			//e.printStackTrace();
		}
		System.out.println("-----------");
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");

	}

}
