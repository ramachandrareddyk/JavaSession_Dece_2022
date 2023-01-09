package javaSessions;

public class StringManupulations {

	public static void main(String[] args) {
		String str="Hello this is my first java code";
		
		//length()
		
		int count=str.length();
		System.out.println(count);
		System.out.println(str.length());
		
		System.out.println("LW = "+0);//0
		System.out.println("HI = "+(str.length()-1));//31
		
		//charAT()
		
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(31));
		
		//System.out.println(str.charAt(35));StringIndexOutOfBoundsException
		
		//indexOf()
		
		System.out.println(str.indexOf('H'));//0
		System.out.println(str.indexOf('e'));//1
		
		System.out.println(str.indexOf('l'));//2
		
		String s="     Hello World     ";
		System.out.println(s);
		//trim
		System.out.println(s.trim());
		
		//Replace
		String date="01-01-2023";
		System.out.println(date);
		System.out.println(date.replace("-", "/"));
		
		//upper case
		String s1="this is my java";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		
		//Lowercase
		String s2="HEELO WORLD";
		System.out.println(s2);
		System.out.println(s2.toLowerCase());
		
		//String comparision
		String a="Testing";
		String b="Testing";
		System.out.println(a.equals(b));
		
		String c="testing";
		
		System.out.println(a.equals(c));//false
		
		System.out.println(a.equalsIgnoreCase(c));
		
		//Contains
		String x="Your browser is chrome";
		
		System.out.println(x.contains("chrome"));
		
		//split
		String l="java python c c++ javascript";
		
		String lang[]=l.split(" ");
		System.out.println(lang.length);//5
		System.out.println(lang[0]);//java
		//System.out.println(lang[5]);//error
		
		String x1="abc;def;ghi;jkl";
		x1.split(";");
		
		
		//SubString
		
		String mm="Your total amount is 100000";
		
		System.out.println(mm.substring(5));
		
		System.out.println(mm.substring(5, 10));
		
		
		String z="20000";
		int ii=Integer.parseInt(z);
		System.out.println(ii);
		
		
		String yy="Testing";//7
		//gnitseT
		
		
		//6 5
		String rev="";
		for(int i=yy.length()-1;i>=0;i--) {
			rev=rev+yy.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev);

	}

}
