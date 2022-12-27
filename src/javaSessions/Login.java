package javaSessions;

public class Login {
	
	String username;
	String Password;
	String Url;
	String pageTitle;
	//this is the class template

	public static void main(String[] args) {
		
		Login amazon= new Login();
		amazon.username="Ramachandra";
		amazon.Password="Test@123";
		amazon.Url="https://www.amazon.in";
		amazon.pageTitle="Login page";
		
		Login flipkart= new Login();
		flipkart.username="RamachandraReddy";
		flipkart.Password="Test@123";
		flipkart.Url="https://www.flipkart.com";
		flipkart.pageTitle="Login page";
		

	}

}
