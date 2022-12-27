package javaSessions;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//Array list is the default class in java
		//Dynamic Array
		//Size is not fixed
		//Values will store in index base
		//to create Arraylist we have to create Object of arraylist class
		
		
		ArrayList sr= new ArrayList();
		//to get the length of array list we havce to use size();
		System.out.println(sr.size());//0
		
		sr.add("Mahesh");//0
		sr.add("Suresh");//1
		
		System.out.println(sr.size());//2
		
		sr.add("Naresh");//2
		sr.add("Manju");//3

		System.out.println(sr.size());//4

		sr.add("Phill");//4
		sr.add("Mark");//5
		sr.add("Colin");//6
		sr.add("Nelson");//7
		
		sr.add(1000);
		
		System.out.println(sr.size());//8
		
		sr.remove(3);
		
		System.out.println(sr.size());//7
		
		System.out.println(sr.get(3));//phill
		
		//System.out.println(sr.get(7));// java.lang.IndexOutOfBoundsException
		System.out.println("===========================================");
		for (int i = 0; i < sr.size(); i++) {
			System.out.println(sr.get(i));
		}
		//genarics in java
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("Phill");
		names.add("Arena");
		//names.add(4000); error
		
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(1000);
		num.add(5000);
		num.add(40000);
		
		ArrayList<Character> alphabits= new ArrayList<Character>();
		alphabits.add('3');
		alphabits.add('t');
		alphabits.add('&');
		alphabits.add(' ');
		
		for (int i = 0; i < alphabits.size(); i++) {
			System.out.println(alphabits.get(i));
		}
		System.out.println("----------------------------------");
		for(Character c:alphabits) {
			System.out.println(c);
		}
		
		
		//Strings, integers, Double, chracters, bool
		
		ArrayList<Object> arr= new ArrayList<Object>();
		
		arr.add("Phill");
		arr.add(40000);
		arr.add('&');
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		for(Object e:arr) {
			System.out.println(e);
		}
		
		
		
	}

}
