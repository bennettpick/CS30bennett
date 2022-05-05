package stats;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;


public class stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		//
 
							//	{
				File scores = new File("../Chapter11/src/stats/stats.txt");
				FileReader in;
				BufferedReader readFile;
			 int NumS=0;
				 int arrycount = 0;
				 int goo1 =0;
				String score;
				double goo;
			
				int count = 1;
				try {
				 in = new FileReader(scores);
				 readFile = new BufferedReader(in); 
					int	 dataArr[] = new int[4];
					
				while ((score = readFile.readLine()) != null ) {

					 if(count % 2 ==0 ) { //if numScores is even
						 
						 goo = Double.parseDouble(score); //adding to the total score if the line is a score line
						 
						 goo1 += Double.parseDouble(score);
						 
						 
						 System.out.println(score); 
						 NumS += 1;
						 dataArr [arrycount] = (int)goo; 
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
				

					System.out.println("minimum:" + dataArr[0]); 
					System.out.println("maximum:" + dataArr[3]); 
					count = goo1 / arrycount;
					System.out.println("Average is " +  count);
					Arrays.sort(dataArr);
				 } 
				 
				 catch (IOException e) {
				 System.out.println("Problem reading file.");
				 System.err.println("IOException: " + e.getMessage());


				 }			
				 
}
	
}