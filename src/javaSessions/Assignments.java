package javaSessions;

public class Assignments {

	public static void main(String[] args) {
		System.out.println("-------Find out max number in given variables-------");
	//Find out max number in given variables	
		int p=134;
		int q=56;
		int r=24;
		int t=67;
		int u=0;
		int v=99;
		
		if(p>q && p>r && p>t && p>u && p>v) {
			System.out.println("P is the max number");
		} else if(q>r && q>t && q>u && q>v) {
			System.out.println("Q is the max number");
		} else if(r>t && r>u && r>v) {
			System.out.println("R is the Max number");
		}else if(t>u && t>v) {
			System.out.println("T is the max number");
		} else if(u>v) {
			System.out.println("U is the max number");
		}else {
			System.out.println("V is the max number");
		}
		
		System.out.println("-------Swaing two numbers with additional variable-------");
		
		//Swaing two numbers with additional variable
		int a=100;
		int b=200;
		
		int c=a;
		a=b;//200
		b=c;//100
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		System.out.println("-------Swaing two numbers with out additional variable-------");
		
		int x=100;
		int y=200;
		
		x=x+y;//300
		y=x-y;//300-200=100
		x=x-y;//300-100=200
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		
		

	}

}