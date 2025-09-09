package Core_Java;

public class Class_Demo {
	
	Class_Demo(){	// Default constructor
		System.out.println("Default constructor");
	}
	Class_Demo(int a){	// One arg int constructor
		System.out.println("One arg int constructor");
	}
	Class_Demo(String s){	// One arg String constructor
		System.out.println("One arg String constructor");
	}
	
	void add(int a, int b) {
		System.out.println("Adding a+b ="+(a+b));
	}
	void sub(int a, int b) {
		System.out.println("Subtract a-b = "+ (a-b));
	}
	void mul(int a, int b) {
		System.out.println("Multiplication a*b = "+a*b);
	}
	void dev(int a, int b) {
		System.out.println("Devide a/b : "+a/b);
	}
	public static void main(String[] args) {

			
		System.out.println("Hi CSK - Welcome to Java 2025");
		
		Class_Demo c = new Class_Demo(); // Creating object and default constructor
		c.add(20, 10);	// method calling 
		c.sub(20, 10);
		c.mul(20, 10);
		c.dev(20, 10);
		
		//Nameless object 
		new Class_Demo(50);
		new Class_Demo("Sathis");

		}
}
