package Rooster;
/*
 * Author: Bennett Pick
 * Purpose: Ask for number of students, then asks for student first, and last name, which will be sent to a file.
 *  The system the prints all the students full names 
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
public class Rooster {
public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 FileReader in;
		 BufferedReader readFile;
		 FileWriter out;
		 BufferedWriter writeFile;
		 PrintWriter pw;
		 
		 
		 String students; // a string for the line that comes in that will be converted into a double
	
	
		 int count = 1; // number of namesF in file
		int numberS=0;
		
	
		 int numS ;
		
		 
        //foramt for the file to be read must be name first then students
		 try {
		
		 int highLow[] = {}; 
		 
		 //make the file and put the values in
		 
		 String userfile ;
		 
		 System.out.println("enter the file that you want to right names to");
			
		 userfile =  input.nextLine(); // user input 
		
	    
		 File namesF = new File("../Chapter11/src/Rooster/" + userfile + ".txt"); // statement
		
		  // studentr is existing file  
	
		 
		 try { // file catch system 
	            // if it does not exist
	            if (namesF.createNewFile()) //not an actual file its a file object representing a file
	                System.out.println("File created");
	            else //if it exists
	                System.out.println("File already exists");
	        }
	        catch (Exception e) {
	            System.err.println(e);
	        }
		 
		 
		//err
		 String Sstore = "";
		 int n = 0;
		 
		 in = new FileReader(namesF);
		 out = new FileWriter(namesF);
		 readFile = new BufferedReader(in);
		 writeFile = new BufferedWriter(out);
		 pw = new PrintWriter(writeFile);
		 
		 System.out.println("enter the number of students you want to enter");
		 numS = input.nextInt();
		 input.nextLine(); //eating \n
		 
		 String[] arrNew = new String[numS];
		 int arrL = 0;
		 
		 
		 while (n < numS*2) { //while the loop counter is lesthen 2 times the number of students (2 x because you need to write namesF and names) 
		 
			 
			 
			
			 
			 
			 if (n %2 == 0) { //runs this one first 
				 
				 System.out.print("Enter the students first name: ");
				 Sstore = input.nextLine();
				 
				 pw.println(Sstore); //writing to the file
				 pw.flush();
				 
			 }
			 
			  if (n % 2 != 0 ){ 
				 System.out.print("Enter the students last name: ");
				 Sstore = input.nextLine(); //string saves last name 
				 arrNew [highLow.length + arrL] = Sstore; 
				 pw.println(Sstore); 
				 pw.flush();
				 arrL = arrL+ 1;
				 
			 }
			 
			  
			 n = n + 1; 
			 
		 }
		 
		 
		 
		
		 
		 
		 
		 
		 System.out.println("There are " + numS + " students in the class"); // prints number of students 
		 while ((students = readFile.readLine()) != null ) { // sets up array 
			 
		
			 if(count % 2 ==0 ) { //if count is even
			 
			
		 
		
		 
				 System.out.println(students); //print ln to get to next line
				 numberS += 1;
				 
			 }
		 
			 else {
				System.out.print("First Name: " + students + " Last Name: "); //printing the name and staying on the same line
			 }
	 count += 1;
		 
		 	}
		 
		System.out.println("Names have been sent to " + userfile);
		 
		 writeFile.close();
		 readFile.close();
		 out.close();
		 in.close();
		 
		 } 
		 
		 catch (IOException e) {
			 System.out.println("Problem reading file.");
			 System.err.println("IOException: " + e.getMessage());
		 }
		 input.close();
	}
}

