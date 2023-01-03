package Polymorphism;

public class MethodOverLoadingConcept {

	public static void main(String[] args) {
		
		MethodOverLoadingConcept obj= new MethodOverLoadingConcept();
		
		obj.login("Test", "Test123");
		
		obj.login();
		
		obj.login("1234567890", 123456);
		
		obj.login("test", "Test@123", "testmessage");
	}
	
	//Class having multiple methods with same name
	//with differenet paremeters/inputs and
	//with different nuber of inputs
	
	public void login() {
		System.out.println("This is login");
	}
	
	public void login(String Username, String Password) {
		System.out.println("This is login with username and password");
	}
	public void login(String Username, String Password, String message) {
		System.out.println("This is login with username and password and message");
	}
	public void login(String Mobilenumber, int OTP) {
		System.out.println("This is login with mobile number and OTP");
	}
	
	//Ex:2
	
	public void search() {
		System.out.println("Product search");
	}
	public void search(String prodctname,String color) {
		System.out.println("Product search with name and color");
	}
	public void search(String name, int price) {
		System.out.println("Product search name and price");
	}
	public void search(String name, int price, String brand ) {
		System.out.println("Product search with Name,price and Brand");
	}
	
	//Ex:3
	public void cabBook() {
		System.out.println("Cab Booking");
	}
	
	public void cabBook(String Location) {
		System.out.println("Cab Booking with location");
	}
	public void cabBook(int pincode) {
		System.out.println("Cab Booking with pin code");
	}
	public void cabBook(String location, int pincode) {
		System.out.println("Cab Booking with location and pincode");
	}
	public void cabBook(String location, String Area) {
		System.out.println("Cab Booking with location and area");
	}
	
	
	
	
	
	
	

}
