package Core_Java;



public class VariablesDemo {
	
	void m1() {
		
		int a=10; // local variable a is integer type and holding the value is 10
		int b=50; // local variable b is integer type and holding the value is 50
		
		System.out.println(a);
		System.out.println(b);
	}
	
	void m2() {
		
		//System.out.println(a);// can not access the variable a for the outside the method local variable
	}
	
	public static void main(String[] args) {
		
		int x=100;
		int y=50;
		System.out.println(x +":"+y);
		
	}

}
