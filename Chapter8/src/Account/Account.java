package Account;
	
	
	




import java.text.NumberFormat;


public class Account extends Customer {

	
	private double balance;
	
	
	public Account(double bal, String fName, String lName, String str, String city, String pro, String zip) { //format is balance
		super(fName, lName, str, city, pro, zip);
		balance = bal;
	}
	

	public double getBalance() {
	 	return(balance);
	}


	
	public void deposit(double amt) {
	 	balance += amt; // adding the amount
	}

	
	
	public void withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance = balance - amt; // withdraw code  
	 	} else {
	 		System.out.println("You don't have enough money to make a withdraw."); 
	 	}
	}
	
	public void tax(double loserMoney) {
		balance = balance - loserMoney; 
	}
	
	
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();  // shows user their money

		accountString = super.toString(); //money is somthing to make it look nice
	 	return(accountString);
	}
}

