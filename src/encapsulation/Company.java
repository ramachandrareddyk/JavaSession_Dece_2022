package encapsulation;

public class Company {
	
	// ia a process of wrapping code and data together into a single unit 
	
	
	public String name;
	public int age;
	private int price;
	
	public String getName() {
		return "Tom";
	}
	
	private int getprice() {
		return 450;
	}
	
	public static void main(String[] args) {
		Company com= new Company();
		com.name="Peter";
		com.age=34;
		com.price=500;
		
		com.getName();
		com.getprice();
		
		
		
		
		
	}
	

}
