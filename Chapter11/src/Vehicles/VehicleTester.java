/*TItle: UEmployee
 * Author: Bennett Pick
 * Purpose: A java application that stores and displays 
 attributes of vehicles. These can be subcategories of trucks
 cars or minivans. Upon storing the data, the 
 application will print out what is stored/ 
 */



 package Vehicles;
 
public class VehicleTester {
	public static void main(String[]args) {
		Car mazda = new Car(2, 1.5, true, "black","Mazda" , 2, false); // sets up initial conditions for the car
		System.out.println("Mazda"); //name of car
		System.out.println("The number of doors is " + mazda.getDoorNumber()); //number of doors 
		System.out.println("The wheel diameter is " +  mazda.getWheelDiamter()); // wheel diameter 
		if (mazda.getfulid() == true) { // if the tank is full or not 
			
					System.out.println("The tank is full");
					} else  {
						System.out.println("The tank is not full"); 
					}
				System.out.println("The colour of the car is " + mazda.getColour()); // colour of car 
				System.out.println("The maker of the car is " + mazda.getCompanyOwned()); // the company that owns the car 
				System.out.println("The car has " + mazda.getSeating() + " seats"); //number of seats
				System.out.println("The car " + mazda.isCivicString()); // if it is civic or not 
				
				System.out.println("");
			//	
		Truck ford  = new Truck(2, (double) 2, false, "grey", "Ford", 2, true); // sets up truck 
		System.out.println("Ford");
		System.out.println("The number of doors is " + ford.getDoorNumber());
		System.out.println("The wheel diameter is " +  ford.getWheelDiamter());
		if (ford.getfulid() == true) {
			
					System.out.println("The tank is full");
					} else  {
						System.out.println("The tank is not full");
					}
				System.out.println("The colour of the truck is " + ford.getColour());
				System.out.println("The maker of the truck is " + ford.getCompanyOwned());
				System.out.println("The truck has " + ford.getSeating() + " seats");
				if (ford.getCapped() == true) { // if the truck has caps or not 
					
					System.out.println("The truck has caps");
					} else  {
						System.out.println("The truck does not have caps");
					}
					
				System.out.println("");
				
				Minivan Caravan = new Minivan(4, (double) 2, true, "red", "Ford", 4, false); // sets up minivan 
				System.out.println("Caravan");
				System.out.println("The number of doors is " + Caravan.getDoorNumber());
				System.out.println("The wheel diameter is " +  Caravan.getWheelDiamter());
				if (Caravan.getfulid() == true) {
					
							System.out.println("The tank is full");
							} else  {
								System.out.println("The tank is not full");
							}
						System.out.println("The colour of the minivan is " + Caravan.getColour());
						System.out.println("The maker of the minivan is " + Caravan.getCompanyOwned());
						System.out.println("The minivan has " + Caravan.getSeating() + " seats");
						if (Caravan.getSlidingDoor() == true) { // if the minivan has sliding doors or not 
							
							System.out.println("The minivan has sliding doors");
							} else  {
								System.out.println("The minivan does not has sliding doors");
							}
	
	
	
	
	
	
	
	}
	
	
}


	
