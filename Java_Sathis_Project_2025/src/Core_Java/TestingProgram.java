package Core_Java;

class X{
	 class m1{
		
	}
}
public class TestingProgram {
	int m=0; // will compile
	final int a=0; // will compile
	//final int a; // will not compile
	
	void m1() {
		//final int y; // will compile
		//final int y=90; // will compile
	}
	
//	TestingProgram(){  
//		int a;
//	}
//	 TestingProgram(){// will compile
//		int a=90;
//	}
	public static void main(String[] args) {
		System.out.println("run");
	}
		
}

/*
int array[] = {5,8,9,15,7,3,50,90,66,70,80,1};
		int max = array[0];
		int min = array[0];
				
		for (int i = 0; i < array.length; i++) {
			
			// checking maximum value
			if(array[i]>max) {
				max=array[i];
			}
			
			// checking minimum value
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

***********************************************
*Multiply table which is user given upto this no.

Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
for (int i = 0; i <= num; i++) {
	sum=i*5;
	if(sum<=num)
	System.out.print(" "+sum);
}
*************************************************
for vs for each
String s = "This is my first Java code for ever";
		char c[] = s.toCharArray();
		int count=0;
		
//		for (int i = 0; i < c.length; i++) {
//			
//			if(c[i]==' ') {
//				count++;
//			}
//			
//		}
			for (char d : c) {
				if(d==' ') {
					count++;
				}
			}
			System.out.println(count);
-----------------------
public class TestingProgram {
	int a=0; // will compile
	final int a=0; // will compile
	final int a; // will not compile
	
	void m1() {
		final int y; // will compile
		final int y=90; // will compile
	}
	
	TestingProgram(){  
		int a=90;
	}
	private TestingProgram(){// will compile
		int a=90;
	}
	public static void main(String[] args) {
		System.out.println("run");
	}
		
}
----------------------------------
abstract class X extends Y{
	
}

class Y{
	
}

interface A{}
interface B extends A{}

class Ab implements B{}

public class TestingProgram {
	final int a=10;
	
	void m1() {
		final int y=90;
	}
	
	private TestingProgram(){
		int a=90;
	}
	public static void main(String[] args) {
		System.out.println("run");
		
		Object o = new Object();
		o.clone()// will not run it is protected
	}
		
}
--------------

class X{
	 class m1{
		
	}
}
public class TestingProgram {
	
	public void static m1() {}
	public final static int a=10;
	private X xx= new X();
	public static void main(String[] args) {
		
	System.out.println("Run");
	//private X xx= new X();// will not comple -only final is permitted
	}
}
------------




*/