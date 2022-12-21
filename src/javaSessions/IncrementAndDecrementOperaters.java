package javaSessions;

public class IncrementAndDecrementOperaters {
	
	public static void main(String[] args) {
		
		
		//1. increment Operaters
				//a. Post increment
				//b. Pre increment
		//2. Decrement Operators
				//a. Post Decrement
				//b. Pre decrement
		
		
		//a. Post increment
		
		System.out.println("----------Post increment-------------");
		int a=1;
		int b=a++;
		
		System.out.println(a);//2
		
		System.out.println(b);//1
		
		int m=10;
		int n=m++;
		
		System.out.println(m);//11
		System.out.println(n);//10
		
		int x=-1;
		int y=x++;
		
		System.out.println(x);//0
		
		System.out.println(y);//-1
		
		//b. Pre increment
		System.out.println("----------Pre increment-------------");
		
		int p=1;
		int q=++p;
		
		System.out.println(p);//2
		System.out.println(q);//2
		
		int c=99;
		int d=++c;
		
		System.out.println(c);//100
		System.out.println(d);//100
		
		int e=-99;
		int f=++e;
		
		System.out.println(e);//-98
		System.out.println(f);//-98
		
		//a. Post Decrement
		System.out.println("----------Post Decrement-------------");
		
		int r=2;
		int s=r--;
		
		System.out.println(r);//1
		System.out.println(s);//2
		
		int w=-2;
		int u=w--;
		
		System.out.println(w);//-3
		System.out.println(u);//-2
		
		System.out.println("----------Pre Decrement-------------");
		
		int g=2;//1
		int h=--g;//1
		
		System.out.println(g);//1
		System.out.println(h);//1
		
		System.out.println("---------------------------------------");
		int v=2;
		
		System.out.println(v++);// 2
		System.out.println(v);// 3
		
	}

}
