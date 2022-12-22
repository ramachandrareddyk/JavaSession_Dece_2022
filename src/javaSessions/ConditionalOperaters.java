package javaSessions;

public class ConditionalOperaters {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println(a == b);//false
		
		//if
		//if else
		//nested if
		//if else if
		//switch case
		
		if(a==b) {
			System.out.println("Both are equal");
		}
		
		if(a<b) {
			System.out.println("a is the smalest value");
		}
		
		if(a==b) {
			System.out.println("Both are equal");
		}else{
			System.out.println("Both are not equal");
		}
		if(a<b) {
			System.out.println("a is the smalest value");
		} else {
			System.out.println("B is the smalest vale");
		}
		
		//Dead code
		
		 // if(false) { System.out.println("Pass"); }else { System.out.println("Fail"); }
		 
		//Coments  --> ctrl+shift+forword slash /
		//Remoce comment -->ctrl+shift+backword slash \
		
		int marks=44;
		if(marks>=45) {
			System.out.println("Pass");
			if(marks>=60) {
				System.out.println("Grade A");
				if(marks>=80) {
					System.out.println("Grade A+");
				}
			}
		}else {
			System.out.println("Fail");
		}
		
		String s="Test";
		String s1="Test";
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		String Browser="    ";
		
//		if(Browser.equals("chrome")) {
//			System.out.println("Launch chrome browser");
//		}
//		if(Browser.equals("ff")) {
//			System.out.println("Launch Fire fox browser");
//		}
//		if(Browser.equals("ie")) {
//			System.out.println("Launch IE browser");
//		}
//		
//		if(Browser.equals("safari")) {
//			System.out.println("Launch sfari browser");
//		}
		
		if(Browser.equals("chrome")) {
			System.out.println("chrome Browser");
		} else if(Browser.equals("FF")){
			System.out.println("Fire fox browser");
		} else if(Browser.equals("ie")) {
			System.out.println("Internet Explorer browser");
		} else if(Browser.equals("safari")) {
			System.out.println("Safari browser");
		}else {
			System.out.println("Please pass the correct browser name");
		}
		
		int x=40;
		int y=30;
		int z=50;
		
		if(x>y && x>z ) {
			System.out.println("X in max number");
		}else if (y>z) {
			System.out.println("Y is the max number");
		} else {
			System.out.println("z is the max number");
		}
		
		//Assignment
		//Find out max number in below variables
		
		int p=34;
		int q=56;
		int r=24;
		int t=67;
		int u=0;
		int v=-99;
		
		
		//Swaping two numbers
		//int x=100
		//int y=200
		
		//System.out.println(x);//200
		//System.out.println(y);//100
		
			
	}

}
