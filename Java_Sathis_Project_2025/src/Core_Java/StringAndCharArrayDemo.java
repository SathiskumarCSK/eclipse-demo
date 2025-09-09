package Core_Java;

public class StringAndCharArrayDemo {

	public static void main(String[] args) {
		// character level processing using String
		
				//String s="Its SIMPLE Rs120 is it 150?";
				//String s="NO25 Sound is the Good to hear";
				String s="No25 Dhanya Age 20 ";
				System.out.println("Get the char by char in a string :");
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i); 
					System.out.println(c);
					}
					System.out.println("*****************");
					
					System.out.println("Char" + " - "+"ASCII code");}
	}

				//for (int i = 0; i < s.length(); i++) {
//					char c = s.charAt(i);
//					System.out.println(c + " - "+(int)c);
//					}
//					System.out.println("*****************");
//				
//					System.out.print("UpperCase/LowerCase/Digit : ");
//				for (int i = 0; i < s.length(); i++) {
//					char c = s.charAt(i);
//					 
//					System.out.println();
//					System.out.println("*****************");
//				
//					int count=0,count1=0,count2=0;
//					for (int i = 0; i < s.length(); i++) {
//						char c = s.charAt(i);
//						if(Character.isUpperCase(c))
//							count++;
//						if(Character.isLowerCase(c)) 
//							count1++;
//						if(Character.isDigit(c))
//							count2++;
//						}
//					System.out.print("Uppercase = "+count+" "+"Lowercase = "+count1+" "+"Digit = "+count2);
//					System.out.println();
//					System.out.println("***************************************");
//				
//					String x="",y=" ";
//					for (int i = 0; i < s.length(); i++) {
//						char c= s.charAt(i);
//						if(Character.isDigit(c))
//							x=x+c;
//						else
//							y=y+c;
//						
//					}
//					String sen=x+y;
//					System.out.println(sen);
//					System.out.println();
//					System.out.println("***************************************");
					
					
//					String x="",y=" ";
//					for (int i = 0; i < s.length(); i++) {
//						char c= s.charAt(i);
//						if(Character.isUpperCase(c))
//							x=x+c;
//						else
//							y=y+c;
//						
//					}
//					String sen=x+y;
//					System.out.println(sen);
//					System.out.println();
//					System.out.println("***************************************");
//				
//					String x="";
//					for (int i = 0; i < s.length(); i++) {
//						char c= s.charAt(i);
//						if(!Character.isWhitespace(c))
//							x=x+c;
//					}
//					System.out.println(x);
//					System.out.println();
//					System.out.println("***************************************");
					
//					String r="";
				
					
//				 
//				
//	}
//}


		/*
		1. Print each character of the String in separate line.
		2. Print only Uppercase/Lowercase/Digit character of a String. 
		3. Count only Uppercase/lowercase character in a string.
		4. Creating a new string containing only uppercase character
		5. Creating a new string with digits and then characters
		6. Creating a new string with uppercase character first and then remaining string
		7. Creating a new string after removing all spaces in a string 
		8. Write a program to reverse the case of a String 
		*/



		/*
		//CHARACTERS ARRAY - OPERATIONS
				  
				System.out.print("UpperCase Character are : ");
				for(int i=0;i<arr.length;i++) {
					if(Character.isUpperCase(arr[i]))
					System.out.print(arr[i]+"");
				}
				System.out.println();
				System.out.print("Another way of UpperCase Character are : ");
				for(int i=0;i<arr.length;i++) {
					if(Character.isUpperCase(arr[i]))
						s+=arr[i];
				}
				System.out.println(s);
				
				System.out.println();
				System.out.print("LowerCase Character are : ");
				for(int i=0;i<arr.length;i++) {
					if(Character.isLowerCase(arr[i]))
					System.out.print(arr[i]+"");
				}
				System.out.println();
				System.out.print("Digits are : ");
				for(int i=0;i<arr.length;i++) {
					if(Character.isDigit(arr[i]))
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				System.out.print("Not space : ");
				for(int i=0;i<arr.length;i++) {
					if(!Character.isSpace(arr[i]))
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				System.out.print("UpperCase Character are : ");
				for(int i=0;i<arr.length;i++) {
					if(Character.isUpperCase(arr[i]))
						s+=arr[i];
				}
				System.out.println(s);
				
				System.out.print("Change into Case Character are : ");
				for(int i=0;i<arr.length;i++) {
					if(Character.isUpperCase(arr[i])){
						s1+= Character.toLowerCase(arr[i]);
					}
					else {
						s1+=Character.toUpperCase(arr[i]); 	 	
					}
				}
				System.out.println(s1);
				
				int count=0,lowcount=0;
				System.out.print("Count the UpperCase Character is : ");
				for(int i=0;i<arr.length;i++) {
					if(Character.isUpperCase(arr[i])){
						count++;
					}
					else
					{
						lowcount++;
					}
				}
				System.out.println(count);
				System.out.println("Count the LowerCase Character is : "+ lowcount);

		*/

		/*  STRING ARRAY - OPERATION
		1. Take a string array and print all string which have even length?
		2. Take a string array and print all string which stars with "TH"
		3. Take a string array and print all string which ends with "ING"
		4. Take a string array and print all string which contains with "AND"
		5. Take a string array and print the first character of each string.
		6. Take a string array and convert each string to uppercase and pring it.
		7. Take a string array and capitalize each string (make first letter capital) and print it.
		8. Take a string array and swap the first and last character of each string and then print it.
		9. Take a string array and print each string in reverse

		//String array - operations
				String[] arr = {"THIS", "ONE", "DOING", "HELLO", "AM","I","HI BYE","ROCK","TALK","TOY"}; 
				for(int i=0;i<arr.length;i++) {
					if(arr[i].length()%2==0) {
						System.out.println(arr[i]);
					}
				}	
				
				System.out.println("************************");
				for(int i=0;i<arr.length;i++) {
					if(arr[i].startsWith("TH")) {
						System.out.println(arr[i]);
					}
				}	
				System.out.println("************************");
				for(int i=0;i<arr.length;i++) {
					if(arr[i].endsWith("ING")) {
						System.out.println(arr[i]);
					}
				}	
				System.out.println("************************");
				for(int i=0;i<arr.length;i++) {
					if(arr[i].contains("I")) {
						System.out.println(arr[i]);
					}
				}	
				System.out.println("************************");
				for(int i=0;i<arr.length;i++) {
					 System.out.print(arr[i].charAt(0)+" ");
				}	
				
//				System.out.println("************************");
//				for(int i=0;i<arr.length;i++) {
//					 System.out.print(arr[i].substring(0,4));
//				}	
				System.out.println();
				System.out.println("************************");
				for(int i=0;i<arr.length;i++) {
					 String s = arr[i].toUpperCase();
					 System.out.print(s+ " ");
				}
				System.out.println();
				System.out.println("************************");
				for(int i=0;i<arr.length;i++) {
					 String s = arr[i].toLowerCase();
					 System.out.print(s+ " ");
				}
				System.out.println();
				System.out.println("************************");
				for(int i=0;i<arr.length;i++) {
					 char f= arr[i].charAt(0);
					 f= Character.toLowerCase(f);
					 String E= arr[i].substring(1);
					 System.out.println(f+E);
				}
//				System.out.println();
//				System.out.println("swap************************");
//				for(int i=0;i<arr.length;i++) {
//					 char f = arr[i].charAt(0);
//					 int len = arr[i].length();
//					 char l = arr[i].charAt(len-1);
//					 String st = arr[i].substring(1,len-1);
//					 System.out.println(l+st+f);
//				}
				System.out.println();
				System.out.println("************************");
				for(int i=0;i<arr.length;i++) {
					 String str=arr[i];
					 String rev ="";
					 for (int j = 0; j < str.length(); j++) {
						char c = str.charAt(j);
						rev= c+rev;
						}
					 System.out.println(rev);
				}

		********************************************************
			String s1="NO26 Sound java is a good program for you then you should learn";
				String[] sp= s1.split(" ");
				for(String st:sp) {
					System.out.println(st);
				}
		********************************************************

			//STRING PROGRAMS - Read by CHAR and Read by WORD
			
			
			
		Java All String Methods:-

		The String class has a set of built-in methods that you can use on strings.

		Method	Description-Return Type

		charAt()			Returns the character at the specified index (position)	-char
		codePointAt()		Returns the Unicode of the character at the specified index	-int
		codePointBefore()	Returns the Unicode of the character before the specified index	-int
		codePointCount()	Returns the number of Unicode values found in a string.	-int
		compareTo()			Compares two strings lexicographically	-int
		compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	-int
		concat()			Appends a string to the end of another string	String
		contains()			Checks whether a string contains a sequence of characters	boolean
		contentEquals()		Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
		copyValueOf()		Returns a String that represents the characters of the character array	String
		endsWith()			Checks whether a string ends with the specified character(s)	boolean
		equals()			Compares two strings. Returns true if the strings are equal, and false if not	boolean
		equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
		format()			Returns a formatted string using the specified locale, format string, and arguments	String
		getBytes()			Converts a string into an array of bytes	byte[]
		getChars()			Copies characters from a string to an array of chars	void
		hashCode()			Returns the hash code of a string	int
		indexOf()			Returns the position of the first found occurrence of specified characters in a string	int
		intern()			Returns the canonical representation for the string object	String
		isEmpty()			Checks whether a string is empty or not	boolean
		join()				Joins one or more strings with a specified separator	String
		lastIndexOf()		Returns the position of the last found occurrence of specified characters in a string	int
		length()			Returns the length of a specified string	int
		matches()			Searches a string for a match against a regular expression, and returns the matches	boolean
		offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
		regionMatches()		Tests if two string regions are equal	boolean
		replace()			Searches a string for a specified value, and returns a new string where the specified values are replaced	String
		replaceAll()		Replaces each substring of this string that matches the given regular expression with the given replacement	String
		replaceFirst()		Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
		split()				Splits a string into an array of substrings	String[]
		startsWith()		Checks whether a string starts with specified characters	boolean
		subSequence()		Returns a new character sequence that is a subsequence of this sequence	CharSequence
		substring()			Returns a new string which is the substring of a specified string	String
		toCharArray()		Converts this string to a new character array	char[]
		toLowerCase()		Converts a string to lower case letters	String
		toString()			Returns the value of a String object	String
		toUpperCase()		Converts a string to upper case letters	String
		trim()				Removes whitespace from both ends of a string	String
		valueOf()			Returns the string representation of the specified value	String

		https://www.w3schools.com/java/java_ref_string.asp

		 */

