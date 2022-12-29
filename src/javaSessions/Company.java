package javaSessions;

import java.util.ArrayList;

public class Company {
	
	//Main method we have to use only for execution purpose
	//with main method only programe is going to start
	//We can't able to use return key word inside the main method

	public static void main(String[] args) {
		
		Company com= new Company();
		String name=com.getName();
		System.out.println(name);
		
		String[]ff=com.CoFounders();
		for(String e:ff) {
			System.out.println(e);
		}
		
		ArrayList<String>names=com.employees();
		for(String e:names) {
			System.out.println(e);
		}

	}
	
	//return some string value
	
	public String getName() {
		String name="Mahesh";
		
		return name;
	}
	
	//return boolean
	
	public boolean isTrue() {
		boolean b=true;
		return b;
	}
	
	//retun double value
	
	public double add() {
		double d=23.89;
		return d;
	}
	
	
	//return values directly with out variables
	
	public String GetCEOName() {
		return "Tom";
	}
	
	public int getEmployeTotalCount() {
		return 456;
	}
	
	//Company --- 3 founders
	
	public String[] CoFounders() {
		
		String [] founders=new String[3];
		
		founders[0]="Tom";
		founders[1]="Peter";
		founders[2]="Phill";
		
		return founders;
		
	}
	
	//company--->450
	public ArrayList<String> employees() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Mahesh");
		names.add("Harish");
		names.add("Mohan");
		names.add("Ravi");
		names.add("gopi");
		return names;
		
		
	}
	
	

}
