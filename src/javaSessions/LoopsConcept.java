package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//To avoid the repitative statements we have to use loops
		
		//While 
		//for
		//do while
		
		//How to declare the loop
		//How to use
		//
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
		
		//print numbers from 0-100
		System.out.println("-----------While loop------------");
		int i=0;//Initilazation
		while(i<=100) {//Condition
			System.out.println(i);//Statement or logic
			//i++;//increment and decrement
			//i=i+1;
			++i;
		}
		
		int x=10;
		while(x<=200) {
			System.out.println(x);
			x=x+10;
		}
		System.out.println("----print numbers 100 to 0----");
		int y=100;
		while(y>=0) {
			System.out.println(y);
			y--;
		}
		
		
		//for loop
		System.out.println("------------for loop------------");
		for(int j=0;j<=10;j++) {
			System.out.println(j);
		}
		
		for(int j=0;j<=10;) {
			System.out.println(j);
			j++;
		}
		
		int k;
		for(k=0;k<10;k++) {
			System.out.println(k);
		}
		
		/*
		 * for(;;) { System.out.println("Bye Bye..."); }
		 */
		
		/*
		 * for(int m=0;m<100;) { System.out.println("Testing"); }
		 */
			System.out.println("-----------Print ascci values of characters------------");
		for(int j='a';j<='z';j++) {
			System.out.println(j);
		}
		
		System.out.println("-----------Print  A-Z------------");
		
		for(char j='a';j<='z';j++) {
			System.out.println(j);
		}
		
		//conditions inside the for loop
		
		for(int j=0;j<10;j++) {
			System.out.println(j);
			if(j==5) {
				System.out.println("hello");
			}
		}
		
		//loop with break
		
		for(int j=0;j<10;j++) {
			System.out.println(j);
			if(j==2) {
				System.out.println("hello");
				break;
			}
		}

		
		for(int j=1;j<=5;j++) {
			for(int t=4;t<=5;t++) {
				System.out.println(j+"  "+t);
			}
		}
		
		for(int j=10;j<=0;j--) {
			System.out.println(j);
		}
		
		//do while loop;
		
		int r=1;
		do {
			System.out.println(r);
			r++;
		}while(r<10);
		
		//print even numbers from 0-100---0246
		//print odd numbers from 0-100---13579
		//print prime numbers 0-100-- 2357111317
	}

}
