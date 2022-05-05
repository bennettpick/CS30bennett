package findAndReplace;

//
	
	

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;
	import java.io.*;
	public class findandreplace 
	{
		static FileWriter out;
		static BufferedWriter writeF;

	   @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	   
	   {
		   System.out.print("Enter the term you wish to find: ");
	      File fl = new File("../Chapter11/zzz.txt"); 
	      String[] words = null;  
	      String replace;
	      FileReader fr = new FileReader(fl);  
	      BufferedReader br = new BufferedReader(fr); 
	  	Scanner input = new Scanner(System.in);
	      String userI ;
	      String input1 ;
	     int counter = 0;
	     input1 = input.nextLine();
	//     String line = "";
	     
		
	      String s;     
	   //   String name;
	 //     String input1 = userI;   // Input word to be searched
	      int count=0; 
	      while((s=br.readLine())!=null)  
	    	  
	    	  
	    
	      {
	   words=s.split(" ");  
	          for (String word : words) 
	          {
	             if (word.equals(input1))   
	                 {
	            	   counter += 1;
	                   count ++;    
	             
	                 }
	          
	            	 
	          }
	      }
	  
	      

	  
	      

	      if(count != 0)  
	      {
	        System.out.println("' " + input1 + " ' is present "+count+ " times in the file");
	     // 
	      }
	      else
	      {
	        System.out.println("' " + input1 + " '  is not present in the file");   
	    	
	      }
	      

	      
	     userI = input.nextLine();
			System.out.println("enter what you want to replace " + input1 + " with: ");
			replace = input.nextLine();
		
			
			
			
			try 
			{
			fr = new FileReader(fl);
			br = new BufferedReader(fr);
			
		//	File textFile_replaced = new File("../Chapter11/yyy.txt" + fl );
		//	  File fl = new File("../Chapter11/zzz.txt"); 
			File textFile_replaced = new File("../Chapter11/yyy.txt" );
			out = new FileWriter(textFile_replaced);
			writeF = new BufferedWriter(out);
			
			while ((s = br.readLine()) != null ) {
			
				s = s.replaceAll(input1, replace);
			writeF.write(s);
				writeF.newLine(); //put a new line chracter in
				
					System.out.println(input1 + " has been replaced by " + replace ) ;
			}
	
			writeF.close();
			out.close();
			br.close();
			fr.close();
			
			
			
			
			}
			catch(IOException e)
			{
				System.out.println("Error" + e);
			
			
		
	

	         fr.close();
	     	input.close();
	}
	   }
	}
	

	