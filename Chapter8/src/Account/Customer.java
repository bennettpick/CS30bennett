/*
 * Title: Account 
 * Author: Bennett
 * Purpose: A java application that simulates an account balance and the amount you can withdraw with and without being taxed.
 * The application makes both a personal and business account.
 */



package Account;
public class Customer {

private String firstName, lastName, street, city, province, zip;
		
	//
	
	 // constructor class
	 // pre: none
	 // post: creates customer object . 
	 // Initialize customer data.
	 
	public Customer(String fName, String lName, String str, String c, String pro, String z) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		province = pro;
		zip = z;
	}
	

	/**
	 * string makes customer .
	 * pre: none
	 * post: returns the attributes of the customer obj
	 * 	 */
	 public String toString() {
		String custString;
	//creates data of customer 
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + province + "  " + zip + "\n";
	 	return(custString);
	}
	
	
	
}

