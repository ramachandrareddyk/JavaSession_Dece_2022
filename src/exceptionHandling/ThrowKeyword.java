package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		
		String s=null;
		
		if(s==null) {
			System.out.println("Byee...");
			try {
				throw new Exception("Ther is no value");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
