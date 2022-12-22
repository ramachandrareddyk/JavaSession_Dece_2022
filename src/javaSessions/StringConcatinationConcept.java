package javaSessions;

public class StringConcatinationConcept {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		System.out.println(a+b);//300
		
		double d=12.33;
		double d1=23.33;
		
		System.out.println(d+d1);//35.66
		
		String s="Testing";
		String s1="Selenium";
		
		
		System.out.println(s+s1);//Testingselenium
		
		String s2="10";
		String s3="20";
		System.out.println(s2+s3);//1020
		
		System.out.println(a+b+s2+s3);//3001020
		
		System.out.println(a+s2);//10010
		
		System.out.println(s2+a+b+s3);//1030020   1010020020
		
		System.out.println(s2+(a+b)+s3);//1030020
		
		System.out.println(s2+s3+a+b);//1020300  1020100200
		
		String x="Hello";
		String y="World";
		
		//a=100
		//b=200
		//d=12.33
		//d1=23.33
		System.out.println(a+b+d+d1+x+y);// 3335.66HelloWorld
		
		
		char c1='a';
		char c2='b';
		char c3='c';
		char c4='d';
		
		System.out.println(c1);
		
		System.out.println(c1+c2);//ab  97+98=195
		
		//a-z --> 97 to 122
		//A-Z --> 65-90
		//0-9 --> 48 to 57
		
		System.out.println('j'+'a'+'v'+'a');
		
		
		int x1=20;
		int x2=30;
		
		int x3=x1+x2;//50
		System.out.println(x3);//50
		
		System.out.println(x1+x2);
		int x4=x3-x2;//20
		System.out.println(x4);
		
		System.out.println(4*4);//16
		
		int x5=x1*x2;
		System.out.println(x5);
		
		System.out.println(10/2);//5
		System.out.println(10/3);//
		System.out.println(10.0/3);
		System.out.println(10/3.0);
		System.out.println(10.0/3.0);
		
		System.out.println(10%3);//1
		System.out.println(10%2);//0
		System.out.println(9%2);
		
		
		System.out.println(0/1);
		
		System.out.println(9/0);
		
		
		

	}

}
