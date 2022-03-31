
	
		package puckpart1;

		public class Hockey extends Puck
		{
 
	public Hockey(double r, double t, double w) {
				super(r, t, w);
				// TODO Auto-generated constructor stub
			}
//
			public static void main(String[] args) 
			{
				
				Puck youthPuck = new Puck(1.5, 1.0, 4.5);
				Puck youthPuck2 = new Puck(2.0, 1.5, 5.5);
				
				
				System.out.println("   The first puck: \n" + youthPuck.toString(youthPuck));
				
				System.out.println("\n   The second puck: \n"  + youthPuck2.toString(youthPuck2));
				
				//If statement using boolean method .equals() to determine whether the objects are the same or not.
				if (youthPuck.equals(youthPuck2)) 
				{
					System.out.println("\nThe pucks are equal.");
				}
				else 
				{
					System.out.println("\nThe pucks are not equal.");
				}
			}

		}



