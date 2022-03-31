/*
 * Header 
 * Title: Vehicles
 * Author: Bennett Pick.
 * Purpose to create a class system that displays attributes for different vehicles 
 when entered into the tester source code
 */







package Vehicles;

public class Vehicle { //the class that is sent to the others 

	//creates the types of data collected
		private String  colour, companyOwned;
	private double wheelDiamter;     
	private boolean fuildFull;
	private int doorNumber, seating;

	
	//how the data is entered 
	public Vehicle(int doorNUM, Double wheelD, boolean full, String col, String comp, int seat) {
		
		doorNumber = doorNUM;
		wheelDiamter = wheelD;
		fuildFull = full;
		colour = col;
		companyOwned = comp;
		seating = seat;
	}
	
	public int getDoorNumber() {
		return(doorNumber);
	}
	
	public double getWheelDiamter() {
		return(wheelDiamter);
	}
	
	public boolean getfulid() {
		return(fuildFull);
	}
	
	public String getColour() {
		return(colour);
	}
	
	public String getCompanyOwned() {
		return(companyOwned);
	}
	
	public int getSeating() {
		return(seating);
	}
	
	
	
}

