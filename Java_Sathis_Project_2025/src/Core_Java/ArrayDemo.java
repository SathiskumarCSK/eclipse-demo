package Core_Java;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		//static type
//		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		//Dynamic type
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length :");
		int n = sc.nextInt();
		int a[]= new int[n];
		int len=a.length;
		
		//Getting elements one by one
		for(int i=0;i<len;i++) {
			//System.out.print(a[i]+ " ");
			System.out.println("Enter the "+ (i+1) +" element :");
			a[i]=sc.nextInt();
			}
		
		System.out.println("Done - Getting all the elements are below");
		for(int i=0;i<len;i++) {
			System.out.print(a[i]+ " ");
			
			}
		System.out.println();
		System.out.println("Even numbers are :");
		for(int i=0;i<len;i++) {
			// To print all Even nos
			if(a[i]%2==0)
				System.out.print(a[i] + " ");
			
			}
		System.out.println();
		System.out.println("Odd numbers are :");
		for(int i=0;i<len;i++) {
			// To print all Odd nos
			if(a[i]%2!=0)
				System.out.print(a[i] + " ");
		}
		
	}	
}




/* Array Basic
1.
			int[] arr ;    // declare an array-one dimensional array eg. Data_type variable_name[];
			int[][] array; // declare an array two dimensional array eg. Data_type variable_name[][];
			
			//instantiation an array
			//static type or fixed type
			int a[]= {50,60,65,75,85}; // eg. Data_type variable_name[] ={value of the elements};
			
			//Dynamic type - should give size of the array
			int marks[]= new int[5];  // eg. Data_type variable_name[] = new Data_type[size of the element];
			
			int length = a.length; 
			System.out.println("An array of length is : "+length);
			System.out.println("The first Element is : "+a[0]);
			System.out.println("The Second Element is : "+a[1]);
			System.out.println("The Third Element is : "+a[2]);
			System.out.println("The Forth Element is : "+a[3]);
			System.out.println("The Fifth Element is : "+a[4]);	
			//System.out.println("The Fifth Element is : "+a[5]);	// ArrayIndexOutOfBoundsException:so we need to get n-1 element
			
			// for Looping get element an array
			System.out.println("Getting the ele  ment by using for loop");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
				
			}
			
			System.out.println();
			System.out.println("OR");
			
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
				}

---------------------------------------------------------------------------------------
2.
// getting the elements by user
		
		Scanner sc = new Scanner(System.in);
		int mark[]= new int[5];
		String name[] = new String[5];
		
		for(int i=0;i<mark.length;i++) {
			
			System.out.println("Enter the Names and Marks :"+ (i+1));
			name[i]=sc.next();
			mark[i]=sc.nextInt();
		}
		System.out.println("Done and given all the names and marks");
		
		System.out.println("The outputs are given below");
		for(int i=0;i<mark.length;i++) {
			
			System.out.println("Names "+(i+1)+ " is :"+name[i]);
			System.out.println("Marks "+(i+1)+ " is :"+ mark[i]);
			
		}
---------------------------------------------------------------------------------
3. 		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length :");
		int n = sc.nextInt();
		int a[]= new int[n];
		int len=a.length;
		
		//Getting elements one by one
		for(int i=0;i<len;i++) {
			//System.out.print(a[i]+ " ");
			System.out.println("Enter the "+ (i+1) +" element :");
			a[i]=sc.nextInt();
			}
		
		System.out.println("Done - Getting all the elements");
		System.out.println("Even numbers are :");
		for(int i=0;i<len;i++) {
			// To print all Even nos
			if(a[i]%2==0)
				System.out.print(a[i] + " ");
			
			}
		System.out.println();
		System.out.println("Odd numbers are :");
		for(int i=0;i<len;i++) {
			// To print all Odd nos
			if(a[i]%2!=0)
				System.out.print(a[i] + " ");
		}
---------------------------------------------------------------------------------
4.	Output will be :-
	Given nos are 		: 1 5 12 4 21 8 2 3 7 9 11 100 
	Reverse nos are 	: 100 11 9 7 3 2 8 21 4 12 5 1 
	Minimum no is 		: 1 = Maximum no is :100
	Even nos are 		: 12 4 8 2 100 
	Count of Even no is : 5
	Sum of Even no is 	: 126.0
	Product of Even no is : 76800
	Odd nos are 		: 1 5 21 3 7 9 11 
	Count of Odd no is	: 7
	Sum of Odd no is 	: 57.0
	Product of Odd no is: 218295
	2 digit nos are 	: 12 21 11 
	Sum of 2 digit no is: 44.0
	Divisible by 5 nos are : 5 100 
	Divisible by 10 nos are : 100 	
		
		int a[] = {1,5,12,4,21,8,2,3,7,9,11,100};
		int len = a.length;
		double sum=0,sum1=0,sum2=0; 
		int prod=1, prod1=1, count=0,count1=0;
		int min=a[0], max=a[0];
		
		System.out.print("Given nos are : ");
		for(int i=0;i<len;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.print("Reverse nos are  : ");
		for(int i=len-1;i>=0;i--) {
			
			System.out.print(+a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<len;i++) {
			
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.print("Minimum no is :"+min +" = Maximum no is :" +max);
		
		System.out.println();
		System.out.print("Even nos are : ");
		for(int i=0;i<len;i++) {
			if(a[i]%2==0)
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<len;i++) {
			if(a[i]%2==0)
			count++;
		}
		System.out.print("Count of Even no is : "+ count);
		
		System.out.println();
		for(int i=0;i<len;i++) {
			if(a[i]%2==0)
				sum+=a[i];
			
		}
		System.out.print("Sum of Even no is : "+sum);
		System.out.println();
		for(int i=0;i<len;i++) {
			if(a[i]%2==0)
				prod*=a[i];
			
		}
		System.out.print("Product of Even no is : "+prod);
		
		System.out.println();
		System.out.print("Odd nos are : ");
		for(int i=0;i<len;i++) {
			if(a[i]%2!=0)
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<len;i++) {
			if(a[i]%2!=0)
			count1++;
		}
		System.out.print("Count of Odd no is : "+count1);
		System.out.println();
		for(int i=0;i<len;i++) {
			if(a[i]%2!=0)
				sum1+=a[i];
		}
		System.out.print("Sum of Odd no is : "+sum1);
		System.out.println();
		for(int i=0;i<len;i++) {
			if(a[i]%2!=0)
				prod1*=a[i];
		}
		System.out.print("Product of Odd no is : "+prod1);
		System.out.println();
		System.out.print("2 digit nos are : ");
		for(int i=0;i<len;i++) {
			if(a[i]>9 && a[i]<100)
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<len;i++) {
			if(a[i]>9 && a[i]<100)
			sum2+=a[i];
		}
		
		System.out.print("Sum of 2 digit no is : "+sum2);
		System.out.println();
		System.out.print("Divisible by 5 nos are : ");
		for(int i=0;i<len;i++) {
			if(a[i]%5==0)
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.print("Divisible by 10 nos are : ");
		for(int i=0;i<len;i++) {
			if(a[i]%10==0)
			System.out.print(a[i]+" ");
		}
		
---------------------------------------------------------------------------------
Short question
1. What is the size of the array or Howmany location are reserved for the array?
	byte 	- 1		Ex. byte b[] = new byte[20];		Memory Size:	20 x 1 = 20
	boolean - 1  		boolean bn = new boolean[10];					10 x 1 = 10
	char 	- 2			char c[] = new char[20];						20 x 2 = 40
	short	- 2 		short s[] = new short[20];						20 x 2 = 40
	int 	- 4			int i[] = new int[20];							20 x 4 = 80
	float	- 4			float f[] = new float[20];						20 x 4 = 80
	long 	- 8			long l[] = new long[20];						20 x 8 = 160
	double	- 8			double d[] = new double[20];					20 x 8 = 160
	
2. Find the error in the program statement and correct them?
	int i[20] = {50,60,65,75,85};		Right= 	i[]
	String x= {"Java","C++"};					x[]
	char c[]={A,B,C,D};							{'A','B','C','D'}
program to print all member of array

	int x'[5]'={6 7,8,5,4,6};					x[]={6,7,8,5,4,6};
	for(int i=1;i<=5;i++){						for(int i=0;i<x.length;i++){
		System.out.println(x);						System.out.println(x[i]); }
	}

3. Write java statements
	1. initialize first element of one -dimension array A as 25.	Ans.A[0]=25;
	2. Assign 65,66,67 to an array arr									int arr[]={65,66,67};
	3. Check if an element at column 5 of an array x[10] is divisible by 2.
		Ans. if(x[4]%2==0)
	4. Initialize true, false, true, true to a boolean array			boolean b[]={true, false, true, true};
	
4. Given the array ar[]={25,58,41,32,75,30,75,80}; Anser the following questions.
	1. what are the indices of the array ar[]?
		Ans: 0 to 7
	2. What is the output of ar.length?
	 	Ans. 8
	3. What is the 4th element of array?
		Ans. 32
	4. Write the statement to print element of 2nd and 4th indexes.
		Ans. System.out.println(a[2]+" "+a[4]);
		
5. What is the output of this program
		int x[]= {-5,-4,-3,-2,-1};
		for(int i=3;i<5;i++){
			System.out.println(x[i]+" ");
		}
		Ans. -2,-1
6. What is the output of this program
		double d[] = new double[5];
		for(int j=0;j<5;j++){
			x[j]=j;
			System.out.println(x[j]);}
		
		Ans. 0,1,2,3,4  x wrong
		Ans. 0.0, 1.0, 2.0, 3.0, 4.0 
		
		
		
**********************************************************	

2D array
		//declare
		int[][] ar;
		ar = new int[3][4];
		
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col]+"  ");
			}
			System.out.println();
			
		}
		System.out.println("*********************");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if(row==0 || row==arr.length-1)
				System.out.print(arr[row][col]+"  ");
			}
			System.out.println();
		}
		 
		System.out.println("*********************");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if(row==0 || row==arr.length-1 || col==0 || col==arr.length-1)
					
				System.out.print(arr[row][col]+" ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("*********************");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if(row==col)
				System.out.print(arr[row][col]+" ");
				else 
					System.out.print("  ");
			}
		
			System.out.println();
			
		}
		System.out.println("*********************");
		int n=arr.length-1;
		for (int row = 0; row < arr.length; row++) {
			for (int col=0; col<arr.length;col++) {
				if(col==n)
				System.out.print(arr[row][col]+" ");
				else 
					System.out.print("  ");
			}
		System.out.println();
			n--;
		}
		
		System.out.println("*********************");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if(row==col ||row+col==arr.length-1)
					
				System.out.print(arr[row][col]+" ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("*********************");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if(row>=col)
					
				System.out.print(arr[row][col]+" ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("*********************");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if(row<=col)
					
				System.out.print(arr[row][col]+" ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("*********************");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if(arr[row][col]%2==0)
					
				System.out.print(arr[row][col]+" ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("*********************");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if(arr[row][col]%2!=0)
					
				System.out.print(arr[row][col]+" ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
output will be 
1  2  3  
4  5  6  
7  8  9  
*********************
1  2  3  

7  8  9  
*********************
1 2 3 
4   6 
7 8 9 
*********************
1     
  5   
    9 
*********************
    3 
  5   
7 
*********************
1   3 
  5   
7   9 
*********************
1     
4 5   
7 8 9 
*********************
1 2 3 
  5 6 
    9 
*********************
  2   
4   6 
  8   
*********************
1   3 
  5   
7   9 
******************

*/
