package Core_Java;

public class TestString {
	public static void main(String[] args) {
//		String s="No25 SoUND ";
//		
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i); 
//			if(Character.isUpperCase(c))		// return only uppercase letter
//				System.out.print(c);	
////			 
//		}
//		
//		System.out.println("-----------------------");
//		String rev="";
//		for (int i = 0; i < s.length(); i++) {
//			char c= s.charAt(i);
//			rev=c+rev;
//		}
//		System.out.println(rev);
		
		
		
		char[] arr={'a','A','2','6',' ','S','o','u','n','d'};
		//String s ="",s1="";
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" "+(int)arr[i]);
		}
	}

}
