package javaSessions;

public class StaticKeyword1 extends StaticKeyWord{
	
	String car;
	String color;
	int price;
	static int weels=4;

	public static void main(String[] args) {
		StaticKeyWord.test();
		
		System.out.println(StaticKeyWord.a);
		
		StaticKeyword1 BMW= new StaticKeyword1();
		BMW.car="x4";
		BMW.color="Black";
		BMW.price=50;
		
		StaticKeyword1 Audi= new StaticKeyword1();
		Audi.car="Q7";
		Audi.color="White";
		Audi.price=30;
		
		StaticKeyword1 Maruthi= new StaticKeyword1();
		Maruthi.car="Swift";
		Maruthi.color="Blue";
		Maruthi.price=10;
		
		System.out.println(BMW.car+"  "+BMW.color+"  "+BMW.price+"  "+weels);
		System.out.println(Audi.car+"  "+Audi.color+"  "+Audi.price+"  "+weels);
		System.out.println(Maruthi.car+"  "+Maruthi.color+"  "+Maruthi.price+"  "+weels);
	}

}
