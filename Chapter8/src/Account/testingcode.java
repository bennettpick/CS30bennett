/*
 * Title: Account 
 * Author: Bennett
 * Purpose: A java application that simulates an account balance and the amount you can withdraw with and without being taxed.
 * The application makes both a personal and business account.
*/

package Account;
import java.util.Scanner;

public class testingcode {

	public static void main(String[] args) {
		// TODO Auto-generated
	//	
		
		double get, getPA;

		Scanner input = new Scanner(System.in); // starts scanner 
		
		
		System.out.println("Test of the new buisness Account");
		
		
		BuisnessAccount NewA = new BuisnessAccount(600, "Name: Bennett", "Pick", "Street: 11th St", "City: Calgary", "Province: Alberta", "Postal Code: T2M 12E" );
		//sets up the business account 
		System.out.println(NewA.toString());
		
		System.out.println("Enter your withdrawal amount: ");
		get = input.nextDouble();  // the user enters the amount they want to withdraw 
		NewA.withdrawal(get);
		
		
		
		
		System.out.println("");  
		
		
		
		System.out.println("New Personal Account");
		
		PersonalAccount MyA = new PersonalAccount(200 , "Name: Bennett", "Pick", "Street: 11th St", "City: Calgary", "Province: Alberta", "Postal Code: T2M 12E" );
		//sets up personal account 
		System.out.println(MyA.toString());
		
		System.out.println("Enter your withdrawal amount: ");
		getPA = input.nextDouble();
		MyA.withdrawal(getPA); // withdrawal from personal account 
		
		
		
		input.close(); // ends scanner 
		
	}

}

