package Adv_Java;


class Sample{
	
//	void m2() {
//		System.out.println("M2 method");
//	}
}



public class Demo {
	
	void m1() {
		System.out.println("Hi");
	}
	
	String m2() {
		System.out.println("Hello");
		return "Java";
	}
	
	int m3() {
		System.out.println("Good morning");
		return 100;
	}
		 static public void main(String[] Sathis) {

			 Demo d = new Demo();
			 d.m1();
			 
			 String s = d.m2();
			 System.out.println(s);
			 
			 int i = d.m3();
			 System.out.println(i);

			 int x=5;
			 int y=10;
			 if(x>y)
			 System.out.println(x);
			 System.out.println(y);
			
			 
		}

}



/*
public class Demo {

int a = 10;
int b = 20;
static int c=30;
static int d=40;

void m1() {
	System.out.println("M1 method");
	System.out.println(a+" : "+b+" : "+c+" : "+d);
}
static void m2() {
	System.out.println("M2 method");
	Demo o = new Demo();
	System.out.println(o.a+" : "+o.b+" : "+c+" : "+d);
}

	 static public void main(String[] Sathis) {

		 Demo d = new Demo();
		 d.m1();
		 d.m2();

		
		
	}
	--------------------------------------------------------
	
	
	public class Demo {
	
	int a = 10;
	static int b=20;
		 static public void main(String[] Sathis) {

			 Demo d = new Demo();
			System.out.println(d.a+" : "+d.b);
			d.a=999;
			d.b=888;
			System.out.println(d.a+" : "+d.b);
			
			Demo d1 = new Demo();
			System.out.println(d1.a+" : "+d1.b);
			d1.a=777;
			d1.b=555;
			System.out.println(d1.a+" : "+d1.b);

			Demo d2 = new Demo();
			System.out.println(d2.a+" : "+d2.b);
			d2.a=100;
			d2.b=200;
			System.out.println(d2.a+" : "+d2.b);
			
			
		}

}


}*/