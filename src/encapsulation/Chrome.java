
package encapsulation;


public class Chrome {
	
	
	public void launchChromeBrowser() {
		
		checkBrowserVersion();
		checkBrowserOSVersion();
		checkRAmCapacity();
		checkRAmSpace();
		
		System.out.println("Chrome browser is launched");
	}
	
	

	private void checkBrowserVersion() {
		System.out.println("Check browser version....");
	}
	
	private void checkBrowserOSVersion() {
		System.out.println("Check browser OS version....");
	}
	
	private void checkRAmSpace() {
		System.out.println("Check Ram space....");
	}
	
	private void checkRAmCapacity() {
		System.out.println("Check Ram Capacity....");
	}
	
	
}
