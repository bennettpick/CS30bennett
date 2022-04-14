package myFile;
import java.io.*; 
import java.util.Scanner;
public class myfilepart1 {
	

	public static void main(String[] args) {
		 File textFile = new File("C:\\Users\\1004189001\\git\\CS30bennett");
	
				
		 if (textFile.exists()) {
		 System.out.println("File already exists.");
		 } else {
		 try {
		 textFile.createNewFile();
		 System.out.println("New file created.");
		 } catch (IOException e) {
		 System.out.println("File could not be created.");
		 System.err.println("IOException: " + e.getMessage());
		 }
		 }
		 }
		}
	
	
	
	


