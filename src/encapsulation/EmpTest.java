package encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee emp= new Employee();
		
		emp.setName("Peter");
		
		String name=emp.getName();
		
		System.out.println(name);
		
		emp.setAge(34);
		
		int i=emp.getAge();
		
		System.out.println(i);

	}

}
