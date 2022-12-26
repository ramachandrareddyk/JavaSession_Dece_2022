package javaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		a=300;
		
		String s="Ram";
		String x="Ravi";
		
		x="Suresh";
		
		//to store the multiple similar values we have to use Array
		
		//To create array we have to create object
		//Array is the pre defined class in java
		
		//1. Static Array
		//2. Dynamic Array
		
		
		//Static Array
		
		//We Can store the similar data types
			//int, Strings, Charctaers
		//Array is the fixed length
			//5
		//Values will store in index based
		//The first element of the array is stored in 0 index, 2 element will store in 1
		
		//Lowest index in array 0
		//Highest index is length-1
		
		//int array
		
		int i[] = new int[5];
		
		i[0]=100;
		i[1]=200;
		i[2]=300;
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		
		i[3]=400;
		//i[4]=500;
		
		System.out.println(i.length);//5
		
		System.out.println("Lowest index is "+0);
		System.out.println("Highest index is "+(i.length-1));
		
		//i[-1]=1000;
		
		//System.out.println(i[-1]);//java.lang.ArrayIndexOutOfBoundsException
		
		//i[5]=1000;
		
		//System.out.println(i[5]);//java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(i[4]);// if we are not storing any values it will give defoult values
		
		//to print all the values from array we have use for loop
		System.out.println("-----------print all the numbers from array using for loop----------");
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		
		//5
		//4
		for (int j = 0; j <=i.length-1; j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("-----------print all the numbers from array using for each loop----------");
		for(int e:i) {
			System.out.println(e);
		}
		
		//2 double array
		System.out.println("============double array================");
		double d[]= new double[5];
		
		
		//0
		//4
		d[0]=12.5;
		d[1]=13.5;
		//2=0.0
		d[3]=44;
		//4=0.0
		
		for(double e:d) {
			System.out.println(e);
		}
		
		//3. Character Array
		char c[]=new char[5];
		
		//4. String array
		String str[]= new String[5];
		str[0]="Mohith";
		str[1]="Sonam";
		str[2]="Mahesh";
		
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
			
		}
		
		for(String e:str) {
			System.out.println(e);
		}
		//Limitations of the array
			//1. Size is fixed : To ovcer come this we have to use dynamic array i.e ArrayList
			//2. Only similar data types we can store : to over come this we have to Object array
		
		
		Object empData[]=new Object[5];
		
		empData[0]="Mark";
		empData[1]=1000123;
		empData[2]=12345.78;
		empData[3]='M';
		empData[4]=true;
		
		for (int j = 0; j < empData.length; j++) {
			System.out.println(empData[j]);
		}

		for(Object e:empData) {
			System.out.println(e);
		}
		
		int xx[] = new int[10];
		xx[0]=10;
		
		//find out highest and lowest number in array
	}

}
