package Account;
import java.util.Scanner;

public class testingcode {

	public static void main(String[] args) {
		// TODO Auto-generated
	//	
		
		double get, getPA;

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Test of the new buisness Account");
		
		
		BuisnessAccount NewA = new BuisnessAccount(600, "Name: Bennett", "Pick", "Street: 11th St", "City: Calgary", "Province: Alberta", "Postal Code: T2M 12E" );
		
		System.out.println(NewA.toString());
		
		System.out.println("Enter your withdrawal amount: ");
		get = input.nextDouble();
		NewA.withdrawal(get);
		
		
		
		
		System.out.println(""); // new line 
		
		
		
		System.out.println("New Personal Account");
		
		PersonalAccount MyA = new PersonalAccount(200 , "Name: Bennett", "Pick", "Street: 11th St", "City: Calgary", "Province: Alberta", "Postal Code: T2M 12E" );
		
		System.out.println(MyA.toString());
		
		System.out.println("Enter your withdrawal amount: ");
		getPA = input.nextDouble();
		MyA.withdrawal(getPA);
		
		
		
		input.close();
		
	}

}

