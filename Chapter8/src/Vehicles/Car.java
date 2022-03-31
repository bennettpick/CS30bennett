package Vehicles;

public class Car extends Vehicle {
	

	private boolean isCiv;
	
	public Car(int doorNUM, Double wheelD, boolean full, String col, String comp, int seat, boolean civ) {
		super(doorNUM, wheelD, full, col, comp, seat);
		isCiv = civ;
		// Initialize new variable 
	}

	
	
	public boolean isCivic() {
		return(isCiv);
	}
	
	public String isCivicString() {  //creates the statement that shows prints what happens if the statement is true or not 
		if (isCiv == true) {
			return("is a civic");
		}
		else{
			return("is not a civic");
		}
	}
	
}


