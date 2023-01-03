package Constructor;

public class Student {
	
	String name;
	int marks;
	//this keyword will refars the current class objects
	//this keyword we will to avoid the cofusan b/w instance variables and local variables
	
	public Student(String name) {
		this.name=name;
	}
	
	public Student(int marks) {
		this.marks=marks;
	}
	
	
	public void m1(String name, int marks) {
		this.name=name;
		this.marks=marks;
	}
	
	
	public static void main(String[] args) {
		Student st= new Student(89);
		System.out.println(st.marks);
		Student st1= new Student("Syed");
		
		System.out.println(st1.name);
		
	}

}
