package inheritence;

public class ManualTester extends Tester{

	public static void main(String[] args) {
		ManualTester test= new ManualTester();
		
		test.ManualTestr();
		test.AutomationTester();
		
		test.testCase();
		test.testScenario();
		
		test.employeeName();
		test.employeeCity();

	}
	
	public void testCase() {
		System.out.println("Test case preparation");
	}
	
	public void testScenario() {
		System.out.println("test Scenario preparation");
	}

}
