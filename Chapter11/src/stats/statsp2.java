package stats;
/*author Bennett Pick
 * Purpose: A system that sends Names with scores to a file, and then reads the file printing the names and score allong with the minimum score, maximum score and average.
 * 
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
public class statsp2 {
public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 FileReader in;
		 BufferedReader readFile;
		 FileWriter out;
		 BufferedWriter writeFile;
		 PrintWriter pw;
		 
		 
		 String Uscore; 
		 double aScore;
		 double totalS = 0; 
		 int count = 1; 
		 int numberS=0;
		 String userfile ;
		 int t =1 ;
		 int numS ;
		
		 
      
		 try {
		
		 int highLow[] = {}; // array for numbers
		 
		 
	
		 
		 
		 
		 System.out.println("enter the file that you want to right Uscore values to");
	
		 userfile =  input.nextLine(); // user input 
		 
		 // enter stats 
		 
	    
		 File Uscores = new File("../Chapter11/src/stats/" + userfile + ".txt"); // statement
		
		 
		 
		 
	    
		//File Uscores = new File("../Chapter11/src/statsP2/" + userfile + ".txt"); //user should enter somthing like soreces.txt
	//	 
		 
		 
		 try {//make the file and put the values in
			  
	            // if it does not exist
	            if (Uscores.createNewFile()) 
	            	System.out.println("File created");
	            else //if it exists
	                System.out.println("File already exists");
	        }
	        catch (Exception e) {
	            System.err.println(e);
	        }
		 
		 // file creation system /\
		
		 String name_sco = "";
		 int n = 0;
		 
		 
		 //creating file readers
		 in = new FileReader(Uscores);
		 out = new FileWriter(Uscores);
		 readFile = new BufferedReader(in);
		 writeFile = new BufferedWriter(out);
		 pw = new PrintWriter(writeFile);
		 
		 System.out.println("enter the number of students you want to enter");
		 numS = input.nextInt();
		 input.nextLine(); // creating the cycle 
		 
		 int[] arrNew = new int[numS]; // putting values to array 
		 int arrLength  = 0;
		 
		 
		 while (n < numS*2) { 
		 
			 
			 
			
			 
			 
			 if (n % 2 == 0) { //runs this first 
				 
				 System.out.println("enter the students name: ");
				 name_sco = input.nextLine();
				 
				 pw.println(name_sco); //writing to the file
				 pw.flush();
				 
			 }
			 
			  if (n % 2 != 0 ){ 
				  System.out.println("enter the students score: ");
				 name_sco = input.nextLine();
				 arrNew [highLow.length + arrLength ] = (int)Double.parseDouble(name_sco); // addsd and sorst to array 
				 pw.println(name_sco); //writing to the file
				 pw.flush();
				 arrLength  = arrLength + 1; // keeps moving array 
				 
			 }
			 
			  
			 n = n + 1; 
			 
		 }
		 
		 
		 
		
		 
		 
		 
		 
		 
		 while ((Uscore = readFile.readLine()) != null ) { //read the file and do the averages and stuff
			 
		
			 if(count % 2 ==0 ) { //if count is even
			 
				 totalS += Double.parseDouble(Uscore); // addds score 
		 
		 
		
		 
				 System.out.println(Uscore); //next line 
				 numberS += 1;
				 
			 }
		 
			 else {
				System.out.print(Uscore + " got a: "); //printing the name and staying on the same line
			 }
			 count += 1;
		 
		 	}
		 
		
		 aScore = totalS / numberS;
		 System.out.println("Average was: " + aScore);
		
		 Arrays.sort(arrNew); //sort the users imputs 
		 
		 System.out.println("Minimum = " + arrNew[0]);
		
		 
		 System.out.println("Maximum = " + arrNew[arrNew.length-1]); //print the highest 

		 
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

