package Vehicles;

public class Truck extends Vehicle {
	

	
	
	private boolean bcap;
	
	
	public Truck(int doorNUM, Double wheelD, boolean full, String col, String comp,int seat, boolean cap) {
		super(doorNUM, wheelD, full, col, comp, seat);
		bcap = cap;
		
		
	}
	
	public boolean getCapped() {
		return(bcap);
	}
	
//
	
	
	
}

