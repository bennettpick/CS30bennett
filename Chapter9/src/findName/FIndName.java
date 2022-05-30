/*
 * Author Bennett Picm 
 * Purpose: an application the gets a number from an user and then stores names to the array set by the user.
 * Then it will list the nsmes and requst the user to search the array for a specfic value
 */



package findName;
import java.util.Scanner; 
import java.lang.Math;
import static java.lang.Math.pow;


public class FIndName {

	
	
	 
	 
	
	public static void main(String[] args) {
	

		
		 int qw = 1; // initilizing varibbles 
	        int stunum ;
	        String stuname ;
	        Scanner input = new Scanner(System.in);
	        String search;
	        int location;
	        
	        System.out.print("How many students are in your rosster?: ");
	        stunum = input.nextInt(); 
	        input.nextLine();
	        
	        String [] sturarr = new String[stunum]; // array set by users number
	       String n ;
	       
	      	        
	       
	         for(int g = 0; g< sturarr.length; g++){ // creates loop smoothness 
	               if (g == 0 ) {  // case to make the sysout nice 
	            	 n = "st"; //first canse 
	               }
	               else {
	            	   n = "nd"; //every othwer case 
	               }
 int l = g + 1;
	             System.out.print("Enter the " + l  +  n +" students name: ");
	             stuname = input.nextLine();
	             sturarr[g]= stuname;
	           
	          
	             
	       }
	      
	        
	        
	         System.out.print("Whos name would you like to look for??: ");
	         search = input.nextLine(); // array searcher 
	         
	         
	         
	         
	        
	         location = searcher.linearSTR(sturarr, search);   //lists for array 
	         
	         
	         
	         
	         if (location == -1) {
	        	 
	         System.out.println("This name is not present in the list.");
	         } 
	         
	         else {
	         
	         System.out.println("First occurrence is element " + location );
	         }
		
		
		
	}

}


