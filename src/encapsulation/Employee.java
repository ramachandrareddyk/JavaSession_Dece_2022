package encapsulation;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private String city;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String dep;

	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	

}
