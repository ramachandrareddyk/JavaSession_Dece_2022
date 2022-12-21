package javaSessions;

public class DataTypesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primitive data types--> We can use this with out creating object
		//Non primiticve data types--> We have to crete object to use that datatypes
		
		//Primitive data types
		//IntegerFamily-->it will store number with out desimals
			//byte  20
			//short 10  10.9--error
			//int
			//long
		
		//Floating family --> it will store numbers with decimals
			//float 20.34
			//double 56.78   56.00
		
		//Characters  --> it will store only one chracter
			//char
		
		//boolean --> We can store any one value true/false
			//true
			//false
		
		//Non Primitive datatypes
			//String ---> it will store group of chracters
			//Allay
			//Allylist
		
		
		//1. byte
		//size: 1 byte= 8 bits
		//Range: -128 to 127
		byte b = 10;
		//byte- data type
		//b - variable name
		// =  Assignment Operator
		//10 is the valueof b
		
		byte b1=127;
		byte b2=-128;
		byte b3=33;
		
		byte b4;
		
		//2. Short
		//size: 2 bytes = 16 bits
		//Range: -32768 - 32767
		
		short s=1000;
		
		short s1=-32768;
		short s2=32767;
		
		//3. int
		//size: 4 bytes - 32 bits
		//Range: -2147483648 - 2147483648
		
		int i=50000;
		int i1=1;
		
		//4. long
		//size: 8 bytes - 32 bits
		//Range:10
		long l=1234567899;
		
		long l1= 1234567891;
		
		//byte, short, int and long the default value is '0'
		
		
		//5. float
		//size: 4 bytes - 32 bits
		//range: around 7 digits after .
		
		float f=123.50f;
		float f1= (float)234.78;
		
		float f3 = 100;//100.0
		
		//6. Double
		//size: 8 bytes - 64 bits
		//range: around 15 digits after .
		
		double d=234566.877676;
		
		double d1;
		
		//7. Chracter
		//size 2 bytes : 16 bits
		
		//float and double the default value is '0.0'
		
		char c='a';
		char c1= '1';
		char c2=' ';
		char c3='#';
		
		//char default value is space ' '
		
		//8 . boolean
		//size 1 bit
		boolean bb= true;
		boolean bb1=false;
		
		//boolean default value 'false'
		
		//String: is the non primitive data tpes
		//it will store group of characters
		
		String str= "Hello Testing";
		
		String str1="100";
		
		String str2="This is my first java programe";
		
		String str3;
		//the default value of the String "null"
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.print("3456");
		
		System.out.print("7890");

	}

}
