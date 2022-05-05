package myFile;
/* Author: Bennett PIck 
 * Purpose: A java application that promps the user for a file and then checks if it exists or not qhich it will tell the user
 * 
 */
import java.io.*; 
import java.util.*;
import java.util.Scanner;
public class myfilepart1 {


	  

	public static void main(String[] args) {
		String userfile;
 System.out.println("enter the file that you want to check for");
 Scanner input = new Scanner(System.in); //scanner

		 userfile =  input.nextLine(); // user input
		 
		 
		 
	    
		 File textFile = new File("../Chapter11/src//" + userfile + ".txt"); // statement to check for feile
		 	//enter name of file 
				
		 if (textFile.exists()) {
		 System.out.println("File already exists.");
		 } else {
		 try {
		 textFile.createNewFile();
		 System.out.println("New file created.");
		 } catch (IOException e) { // error statment 
		 System.out.println("File could not be created.");
		 System.err.println("IOException: " + e.getMessage());
		 }
		 }
		 }
		}
	
	
	
	


//enter "stats" if nothing is working 
