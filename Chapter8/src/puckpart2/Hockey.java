package puckpart2;

public class Hockey extends Disk
{

	public Hockey(double r, double t) {
		super(r, t);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		//Initialization of two puck objects to be tested.
		Puck youthPuck = new Puck(1.5, 1.0, 4.5);
		Puck youthPuck2 = new Puck(2.0, 1.5, 5.5);
		
		//Printing information on the puck objects using .toString() method.
		System.out.println("   The first puck: \n" + youthPuck.toString(youthPuck));
		System.out.println("\n   The second puck: \n" + youthPuck2.toString(youthPuck2));
		
		//If statement using boolean method .equals() to determine whether the objects are the same or not.
		if (youthPuck.equals(youthPuck2)) 
		{
			System.out.println("\nThe pucks are equal.");
		}
		else 
		{
			System.out.println("\nThe pucks are not equal.");
		}
		
		//Switch statement uses the int from .compareTo() to print outcome based on case determined by if statement
		switch (youthPuck.compareTo(youthPuck2))
		{
		case 0:
			System.out.println("\nThe second puck weighs more.");
			break;
		case 1:
			System.out.println("\nThe second puck weighs the same.");
			break;
		case 2:
			System.out.println("\nThe second puck weighs less.");
			break;
		}
	}
}



