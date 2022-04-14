package findAndReplace;

//
	
	

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;
	public class findandreplace 
	{
	   public static void main(String[] args) throws IOException 
	   {
	      File f1=new File("../Chapter11/zzz.txt"); 
	      String[] words=null;  
	      FileReader fr = new FileReader(f1);  
	      BufferedReader br = new BufferedReader(fr); 
	  	Scanner input = new Scanner(System.in);
	      String userI ;
	     userI = input.nextLine();
	      String s;     
	   //   String name;
	      String input1 = userI;   // Input word to be searched
	      int count=0; 
	      while((s=br.readLine())!=null)  
	      {
	         words=s.split(" ");  
	          for (String word : words) 
	          {
	             if (word.equals(input1))   
	                 {
	                   count++;    
	                 }
	          }
	      }
	      if(count!=0)  
	      {
	         System.out.println("The searched term is present for "+count+ " Times in the file");
	      }
	      else
	      {
	         System.out.println("The searched term is not present in the file");
	      }
	      
	         fr.close();
	     	input.close();
	   }


	}