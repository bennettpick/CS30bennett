package puckpart2;

//Setting up class with private weight variable
public class Puck extends Disk implements Comparable<Object>
{
	private double weight;
	
	//Puck constructor
	public Puck(double r, double t, double w) 
	{
		super(r, t); //retrieves r and t variables from the super class Disk
		weight = w;
	}
	
	//Method for setting a new weight for puck.
	public void setWeight(double newWeight) 
	{
		weight = newWeight;
	}

	//Method for retrieving the weight
	public double getWeight() 
	{
		return(weight);
	}
	
	//Method for finding the division based on the weight of a puck
	public String getDivision(Object p) 
	{
		Puck testPuck = (Puck)p; //Assigns object used in method constructor to new object for comparison
		
		//If statement for differentiating based on weight
		if (testPuck.getWeight() >= 5 && testPuck.getWeight() <= 5.5) 
		{
			return("The puck is standard division");
		} 
		else if (testPuck.getWeight() >= 4 && testPuck.getWeight() <= 4.5) 
		{
			return("The puck is youth division");
		} 
		else 
		{
			return("the puck is a non-standard weight");
		}
	}
	
	//Method tests two puck objects against each other to discover if they are the same or not
	public boolean equals(Object p) 
	{
		Puck testPuck = (Puck)p; //Seperates method object into new object to use as comparison against the old using the super classes
		if (testPuck.getRadius() == super.getRadius() && testPuck.getThickness() == super.getThickness() && testPuck.getWeight() == weight) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	//Method for returning a string with information on the object
	public String toString(Object p) 
	{
		Puck strPuck = (Puck)p;
		return("The radius of the puck is " + strPuck.getRadius() + ", the thickness is " + strPuck.getThickness() + ", and the weight is " + strPuck.getThickness() + "\n" + getDivision(strPuck));
	}
	
	//Compares the weights of the first and second puck and returns an int based on the outcome
	public int compareTo(Object p) 
	{
		Puck testPuck = (Puck)p;
		
		//If statement comparing the weight
		if (weight < testPuck.getWeight())
		{
			return 0;
		}
		else if (weight == testPuck.getWeight())
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
}


