package Vehicles;

public class Minivan extends Vehicle{

	
	private boolean sliderDoor; // sets up a new variable 
	
	public Minivan(int doorNUM, Double wheelD, boolean full, String col, String comp,int seat, boolean slide) {
		super(doorNUM, wheelD, full, col, comp, seat);
		sliderDoor = slide; // Initialize new variable 
		
	}
	
	
	public boolean getSlidingDoor() {
		
		
		
		
		return(sliderDoor);
	}
	
}


