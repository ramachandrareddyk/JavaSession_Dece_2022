package javaSessions;

public class TypesOfMethods {

	public static void main(String[] args) {
		TypesOfMethods obj= new TypesOfMethods();
		
		obj.test();
		
		obj.add(20, 40);
		
		obj.add(2, 5);
		
		int l=obj.sum();
		System.out.println(l);
		
		int m=obj.adding(3, 8);
		System.out.println(m);

	}
	
	//1. No return no input
	public void test() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	//2. some input/parameters no return
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	//3. no input with some return value
	
	
	// void and return key words we can't use same time
	
	//We can  return only one value at one time
	public int sum() {
		int x=100;
		int y=200;
		
		int z=x+y;
		
		return z;
	}
	
	//4. with some inputs and some return
	public int adding(int a,int b) {
		int c=a+b;
		
		return c;
	}
	
	
	
	
	

}
