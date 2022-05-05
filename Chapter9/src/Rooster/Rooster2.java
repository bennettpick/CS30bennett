package Rooster;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.io.BufferedReader;
public class Rooster2 {
public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 FileReader in;
		 BufferedReader readFile;
		 FileWriter out;
		 BufferedWriter writeFile;
		 PrintWriter pw;
		 
		  
		 String Uscore;
		 double avgUscore;
		 double totalS = 0; 
		 int count = 1; 
		 int numberS=0;
		 String userfile ;
		 int todd =1 ;
		 int numS ;
		
		 
      
		 try {
		
		 int highLow[] = {}; 
		 
		 
		 
		 
		 
		 
	
			File Uscores = new File("../Chapter11/src/Rooster/studentr.txt");
		 
		 
		 
	   

		
		 
		 
		 try {
			  //make the file and put the values in
	            // if it does not exist
	            if (Uscores.createNewFile()) //not an actual file its a file object representing a file
	                System.out.println("File created");
	            else //if it exists
	                System.out.println("File already exists");
	        }
	        catch (Exception e) {
	            System.err.println(e);
	        }
		 
		 
		
		 String firstN = "";
		 String lastN = "";
		 int n = 0;
		 
		 in = new FileReader(Uscores);
		 out = new FileWriter(Uscores);
		 readFile = new BufferedReader(in);
		 writeFile = new BufferedWriter(out);
		 pw = new PrintWriter(writeFile);
		 
		 System.out.println("enter the number of students you want to enter");
		 numS = input.nextInt();
		 input.nextLine(); //eating \n
		 
		 int[] arrNew = new int[numS];
		 int arrL = 0;
		 
		 
		 while (n < numS*2) { 
		 
			 
			 
			
			 
			 
			 if (n %2 == 0) { //runs this one first 
				 
				 System.out.println("Enter the students fitst name: ");
				 firstN = input.nextLine();
				 
				 pw.println(firstN); //writing to the file
				 pw.flush();
				 
			 }
			 
			  if (n % 2 != 0 ){ //runs this one second then alternates between them as n is incremented
				 System.out.println("Enter the students last name: ");
				 lastN = input.nextLine();
			//	 arrNew [highLow.length + arrL] = (int)Double.parseDouble(firstN); //it's like god wrote this code
				 pw.println(lastN); //writing to the file
				 pw.flush();
				 arrL = arrL+ 1;
				 
			 
			 
			  
			 n = n + 1; 
			 
		 
			  }
		 }
		 }
			  catch (IOException e) {
					 System.out.println("Problem reading file.");
					 System.err.println("IOException: " + e.getMessage());
				 }
			  File Uscores = new File("../Chapter11/src/Rooster/studentr.txt");
		 try (BufferedReader bf = new BufferedReader(new FileReader(Uscores))) {//SURROUND WITH try with resources FOR THE EXCEPTIONS
			 
	            String readLine;
	            int line = 0;
	 
	            while ((readLine = bf.readLine()) != null) {
	                if (line % 2 != 0) {
	                    System.out.println(readLine);
	                }
	                line++;;
	            }
		 } 
		 
		 catch (IOException e) {
			 System.out.println("Problem reading file.");
			 System.err.println("IOException: " + e.getMessage());
		 }
	input.close();
			
		 }
		
}


		 
		
		 
		 
		