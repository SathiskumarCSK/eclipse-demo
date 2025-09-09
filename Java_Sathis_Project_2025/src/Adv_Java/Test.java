package Adv_Java;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		String address;
		long mobileno;
		String location;
		double salary;
		
		System.out.println("Enter the Name :");
		name = sc.nextLine();
		
		System.out.println("Enter Person Age :");
		age = sc.nextInt();
				
		System.out.println("Enter The address :");
		address = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter The Mobile no :");
		mobileno = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter The Location :");
		location = sc.next();
		
		System.out.println("Enter The Salary :");
		salary = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Address : "+ address);
		System.out.println("Mobile No : "+ mobileno);
		System.out.println("Location : "+ location);
		System.out.println("Salary : "+ salary);
		
		
//	int a[] = {10,20,30};
//	int[] b = {10,20,30};

	}
}
