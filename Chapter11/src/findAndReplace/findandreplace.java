package findAndReplace;
/* Author Bennett Pick  
 * Purpose: A system that reads a file, then lets you search for a term which the user will be prompted to replace.
 * This replaced term will be sent to a new file along with the rest of the original file 
 * 
 */
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
	  
	     input1 = input.nextLine();
	//     String line = "";
	     
		
	      String s;     
	   //   String name;
	 //     String input1 = userI;   // Input word to be searched
	      int count=0; 
	      while((s=br.readLine())!=null)  
	    	  
	    	  
	    
	      {
	   words=s.split(" ");   // searches for words in the file 
	  
	          for (String word : words) // checks words 
	          {
	             if (word.equals(input1))   
	                 {
	            	     count ++;    
	             
	                 }
	         
	            	 
	          }
	      }
	  
	      

	  
	      

	      if(count != 0)  
	      {
	        System.out.println("' " + input1 + " ' is present "+count+ " times in the file");
	     // thid dtatment does not work with multipe words in the phrase, however they will still be found and replaced 
	      }
	      else
	      {
	        System.out.println("' " + input1 + " '  is not present in the file");   
	    	
	      }
	      

	      
	  userI = input.nextLine();
			System.out.println("enter what you want to replace " + input1 + " with: ");
			replace = input.nextLine(); // Initializes replace 
		
			
			
			
			try 
			{
			fr = new FileReader(fl);
			br = new BufferedReader(fr);
			
		File textFile_replaced = new File("../Chapter11/yyy.txt" ); // sends to this file 
		
			out = new FileWriter(textFile_replaced);
			writeF = new BufferedWriter(out);
			
			while ((s = br.readLine()) != null ) {
			
				s = s.replaceAll(input1, replace); // writes and replaces the ling 
			writeF.write(s);
				writeF.newLine(); //put a new line chracter in
				
					System.out.println(input1+ " has been replaced by " + replace ) ;
			}
	
			writeF.close();
			out.close();
			br.close();
			fr.close();
			
			
			
			
			}
			catch(IOException e)
			{
				System.out.println("Error" + e);
			
			
		
	

	       //  fr.close();
	     	//input.close();
	}
	   }
	}
	

	