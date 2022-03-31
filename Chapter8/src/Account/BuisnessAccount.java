package Account;
public class BuisnessAccount extends Account{

	
	//
	
	
	
	
	
	
	
	
	public BuisnessAccount(double bal, String fName, String lName, String str, String city, String pro, String zip) {
		super(bal, fName, lName, str, city, pro, zip);
		
	}
	
	public void withdrawal(double amtount) {
		super.withdrawal(amtount); //the balance of the account 
		if (super.getBalance()< 500) { //the amount it checks for 
			super.tax(10); // amount it takes out if below 500
			System.out.println("Pay tax of $10. Now your new balance is: " + super.getBalance());
		}
	}
	
	
	
	
}

