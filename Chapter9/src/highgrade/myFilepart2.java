package highgrade;
import java.io.*; 
import java.util.Scanner;
public class myFilepart2 {
	

	public static void main(String[] args) {
		 File textFile = new File("zzz.txt");
	
			System.out.println("Your file is " + textFile);	
			System.out.println("If you want to delete this file, type delete");
			System.out.println("If you want to save this file, type save");
			Scanner input = new Scanner(System.in);
            String userI;
			 			  
			//  while ;
	 userI = input.nextLine();

			  if (userI.indexOf('d') == 0 && userI.indexOf('e') == 1 && userI.indexOf('t') == 4) {
			
		 System.out.println("This file has been deleted.");
		 
		 input.close();
			} else if (userI.indexOf('s') == 0 && userI.indexOf('a') == 1 && userI.indexOf('e') == 3) {
				System.out.println("This file has been saved.");
			
				input.close();
				
				} else   {
					System.out.println("Input not identified");
					
				}
				}
				
			
			// try {
			
		 
		// textFile.createNewFile();
//		// } catch (IOException e) {
		// System.out.println("File could not be created.");
		// System.err.println("IOException: " + e.getMessage());
		 }
		 
		
		

