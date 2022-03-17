package puckpart2;

public class Circle {

	private static final double PI = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
		

							//	{
				//	final double PI = 3.14; }
					private double radius;
								
				//Circle constructor
		public Circle(double r) {
				 
					 radius = r;
				 }
				 
				
				 public void setRadius(double newRadius) 
				 {
					 radius = newRadius;
				 }
				 
				
				 public double area() 
				 {
					 double circleArea;
					 circleArea = PI * radius * radius;
					 return(circleArea); }
				 

				
				 public double getRadius() 
				 {
					 return(radius);
				 }
			}




