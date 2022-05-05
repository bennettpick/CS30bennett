package stats;

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
		 
		 
		 String Uscore; // a string for the line that comes in that will be converted into a double
		 double avgUscore; // what will reperesnt the average
		 double totalS = 0; //total of all Uscores in file
		 int count = 1; // number of Uscores in file
		 int numberS=0;
		 String userfile ;
		 int todd =1 ;
		 int numS ;
		
		 
        //foramt for the file to be read must be name first then Uscore
		 try {
		
		 int highLow[] = {}; //array to be appened by the users imputs
		 
		 
		 //make the file and put the values in
		 
		 
		 
		// System.out.println("enter the file that you want to right Uscore values to");
			File Uscores = new File("../Chapter11/src/stats/stats2.txt");
		 
		 
		 
	    
		// File Uscores = new File("../Chapter11/src/statsP2/" + userfile + ".txt"); //user should enter somthing like soreces.txt
		 
		 
		 
		 try {//make the file and put the values in
			  
	            // if it does not exist
	            if (Uscores.createNewFile()) //not an actual file its a file object representing a file
	                System.out.println("File created");
	            else //if it exists
	                System.out.println("File already exists");
	        }
	        catch (Exception e) {
	            System.err.println(e);
	        }
		 
		 
		
		 String name_sco = "";
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
		 int startFromTheBottemNowWeHere = 0;
		 
		 
		 while (n < numS*2) { //while the loop counter is lesthen 2 times the number of students (2 x because you need to write Uscores and names) 
		 
			 
			 
			
			 
			 
			 if (n %2 == 0) { //runs this one first 
				 
				 System.out.println("enter the students name: ");
				 name_sco = input.nextLine();
				 
				 pw.println(name_sco); //writing to the file
				 pw.flush();
				 
			 }
			 
			  if (n % 2 != 0 ){ //runs this one second then alternates between them as n is incremented
				 System.out.println("enter the students score: ");
				 name_sco = input.nextLine();
				 arrNew [highLow.length + startFromTheBottemNowWeHere] = (int)Double.parseDouble(name_sco); //it's like god wrote this code
				 pw.println(name_sco); //writing to the file
				 pw.flush();
				 startFromTheBottemNowWeHere = startFromTheBottemNowWeHere+ 1;
				 
			 }
			 
			  
			 n = n + 1; 
			 
		 }
		 
		 
		 
		
		 
		 
		 
		 
		 
		 while ((Uscore = readFile.readLine()) != null ) { //read the file and do the averages and stuff
			 
		
			 if(count % 2 ==0 ) { //if count is even
			 
				 totalS += Double.parseDouble(Uscore); //adding to the total Uscore if the line is a Uscore line
		 
		 
		
		 
				 System.out.println(Uscore); //print ln to get to next line
				 numberS += 1;
				 
			 }
		 
			 else {
				System.out.print(Uscore + " got a: "); //printing the name and staying on the same line
			 }
			 count += 1;
		 
		 	}
		 
		 //after the while loop is done then it outputs the average
		 avgUscore = totalS / numberS;
		 System.out.println("Average was: " + avgUscore);
		
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

