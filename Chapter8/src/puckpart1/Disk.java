
		
		package puckpart1;

		
		public class Disk extends Circle 
		{
			private double thickness;
	
					
	public Disk(double r, double t) 
		{
	super(r);
			thickness = t;

		} 
	
		public void setThickness(double newThickness) 
		{
			thickness = newThickness;
		}

		//Method for retrieving thickness
		public double getThickness() 
		{
			return(thickness);
		}

		//Method for calculating volume by multiplying area by thickness
		public double volume() 
		{
			double v;
			v = super.area() * thickness;
			return v;
		}
		}


		
	