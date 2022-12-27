package javaSessions;

public class User {
String name;
int age;
String city;

	public static void main(String[] args) {
		
		int age=100;
		
		
		User u1= new User();
		u1.name="Neeraj";
		u1.age=56;
		u1.city="Blr";
		
		User u2= new User();
		u2.name="Sanjay";
		u2.age=46;
		u2.city="Pune";
		
		User u3= new User();
		u3.name="Hima";
		u3.age=32;
		u3.city="Hyd";
		
		System.out.println(u1.name+"  "+u1.age+"  "+u1.city);//neeraj
		System.out.println(u2.name+"  "+u2.age+"  "+u2.city);//Sanjay
		System.out.println(u3.name+"  "+u3.age+"  "+u3.city);//Hima
		
		u1=u2;
		
		System.out.println(u1.name+"  "+u1.age+"  "+u1.city);//sanjay
		System.out.println(u2.name+"  "+u2.age+"  "+u2.city);//sanjay
		System.out.println(u3.name+"  "+u3.age+"  "+u3.city);//Hima
		
		u2=u3;
		
		System.out.println(u1.name+"  "+u1.age+"  "+u1.city);//sanjay
		System.out.println(u2.name+"  "+u2.age+"  "+u2.city);//Hima
		System.out.println(u3.name+"  "+u3.age+"  "+u3.city);//hima
		
		u3=u1;
		
		System.out.println(u1.name+"  "+u1.age+"  "+u1.city);//Sanjay
		System.out.println(u2.name+"  "+u2.age+"  "+u2.city);//Hima
		System.out.println(u3.name+"  "+u3.age+"  "+u3.city);//Sanjay
		
		
		User u4= new User();
		
		User u5= new User();
		
		u4=u5;

	}

}
