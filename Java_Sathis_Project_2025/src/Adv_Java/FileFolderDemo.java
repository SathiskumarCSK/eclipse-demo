package Adv_Java;



	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;

	public class FileFolderDemo {

		public static void main(String[] args) {


			/*// 1. Folder Creation
			
			File file = new File("C:\\Users\\JESTO\\Desktop\\RATHINAM");//sub folders
			boolean present = file.exists();
			System.out.println("File Present :"+ present);
			if(present==false)
				file.mkdirs(); // sub folders creations
			present = file.exists();
			System.out.println("File Prsesent :"+ present); */
				
		
		
			// 2. File creation
			
			File file = new File("C:\\Users\\JESTO\\Desktop\\RATHINAM\\test.doc");
			boolean present = file.exists();
			if(present==false)
				try {
					boolean created = file.createNewFile();  //new file creation
					System.out.println("File created :"+ created);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
			/*
			// 3. File Deletion
			
			File file = new File("C:\\Users\\JESTO\\Desktop\\RATHINAM\\test.doc");
			file.delete();
			boolean present = file.exists();  
			System.out.println("File deleted : "+ present);
		
		}*/

			/*
			// 4. File rename
			File file = new File("C:\\Users\\JESTO\\Desktop\\Shameeni123\\test.doc");
			 
			//file.createNewFile();
			
			File newFile = new File("C:\\Users\\JESTO\\Desktop\\Shameeni123\\Sathis.doc");
			boolean renameSuccess = file.renameTo(newFile);
			System.out.println( "renameSuccess "+ renameSuccess);
					
			//5. Printing File rename
			System.out.println(newFile.getName());
			System.out.println(file.canExecute());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			*/
			
			/*
			// Getting  All File and Folder in Desktop
			
			File file = new File("C:\\Users\\JESTO\\Desktop");
			String[] listOfFileFolder= file.list();
			//for(int i=0;i<listOfFileFolder.length;i++) {
			//	System.out.println(listOfFileFolder[i]);
			//}
			for(String s :listOfFileFolder )
				System.out.println(s);
			*/
			/*
			// Getting  only Files in Desktop
			
					File file = new File("C:\\Users\\JESTO\\Desktop");
					File [] listOfFile= file.listFiles();
					
					for(File s :listOfFile )
						if(s.isFile())
						System.out.println(s);
				*/
			/*
			// Getting  only Folders in Desktop
			
			File file = new File("C:\\Users\\JESTO\\Desktop");
			File [] listOfFile= file.listFiles();
			
			for(File s :listOfFile )
				if(s.isDirectory())
				System.out.println(s);
			*/
			
			/*// Getting  only .txt files in Desktop
			File file = new File("C:\\Users\\JESTO\\Desktop");
			File [] listOfFile= file.listFiles();
			
			for(File s :listOfFile ) {
				if(s.isFile())
				{	String fileName = s.getName();
					int lastDot = fileName.lastIndexOf(".");
					String extension = fileName.substrin  g(lastDot+1);
					//System.out.println(extension);
					if(extension.equals("txt"))
						System.out.println(fileName);
				
				}
			}*/
			  	
			
			
			/*
			int a =10,b=0,c;
			try{
		          c= a/b;
		      }
			//System.out.println("in between try - catch ");
			catch(Exception e){
		         System.out.println("Got the Exception ");
		      }
			
			//System.out.println("in between catch - finally");
			
			finally {
				System.out.println("catched finally");
			}
			System.out.println("in last statement");
			*/
			
				/*
				   int age = 10;
				    if(age<18) 
				      throw new ArithmeticException("not valid"); 
				    else 
				      System.out.println("Eligible Candidate"); 
				*/
