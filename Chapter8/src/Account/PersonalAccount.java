package Account;
public class PersonalAccount extends Account {

	
	
	//
	
	
	public PersonalAccount(double bal, String fName, String lName, String str, String city, String pro, String zip) {
		super(bal, fName, lName, str, city, pro, zip);
		
	}
	
	public void withdrawal(double amtount) {
		
		super.withdrawal(amtount); //new withdrawal code 
		
		if (super.getBalance()< 100) { //checks customer ballance 
			
			super.tax(2); // new tax amount 
			System.out.println("Tax of $2. New balance of: " + super.getBalance());
		}
	}
	
	
	
}

