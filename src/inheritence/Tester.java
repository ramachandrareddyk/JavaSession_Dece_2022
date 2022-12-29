package inheritence;

public class Tester extends Employee{

	//extends- Key word to use make a relationship between 2 classes
	//Employee: Parent class
	//Tester:child class
	
	//At once we can't able to extent multiple classes
	
	double bouns=12000;
	public static void main(String[] args) {
		
		Tester test= new Tester();
		
		System.out.println(test.salary+test.bouns);
		
		test.employeeName();
		
		test.employeeCity();
		
		test.ManualTestr();
		
		test.AutomationTester();
	}
	
	public void ManualTestr() {
		System.out.println("Hello Manual Tester");
	}
	
	public void AutomationTester() {
		System.out.println("Hello Automation Tester");
	}

}
