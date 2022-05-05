package stats;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
/* Author: Bennett Pick 
 * Purpose: To create a system that reads numbers in a file and then displays the highest, lowest and average
 * 
 */

public class stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		//
 
							//	{
				File scores = new File("../Chapter11/src/stats/stats.txt"); // file system reads
				FileReader in;
				BufferedReader readFile;
			 int NumS=0;
				 int arrycount = 0;
				 int checker =0;
				String score;
				double check;
			
				int count = 1;
				try {
				 in = new FileReader(scores);
				 readFile = new BufferedReader(in); 
					int	 dataArr[] = new int[4]; // start of array, 4 is how many terms there are 
					
				while ((score = readFile.readLine()) != null ) { // starts the lpoop 

					 if(count % 2 ==0 ) { //if even
						 
						 check = Double.parseDouble(score); //adding to the total score if the line is a score line
						 
						 checker += Double.parseDouble(score);
						 
						 
						 System.out.println(score);  // checks number scores 
						 NumS += 1;
						 dataArr [arrycount] = (int)check; 
						 arrycount += 1;
							
					 }
						 
						 else {
							 System.out.print(score + " got a: "); //printing the name and staying on the same line
						 }
						 
					 count += 1;
					 
						 }
				Arrays.sort(dataArr);
readFile.close();
in.close();
				

					System.out.println("minimum:" + dataArr[0]); // prints minimum by reading the array 
					System.out.println("maximum:" + dataArr[3]);  // prints maximum by reading the array 
					count = checker / arrycount;
					System.out.println("Average is " +  count); // prints average 
					Arrays.sort(dataArr);
				 } 
				 
				 catch (IOException e) {
				 System.out.println("Problem reading file.");
				 System.err.println("IOException: " + e.getMessage());


				 }			
				 
}
	
}