/*TItle: UEmployee
 * Author: Bennett Pick
 * Purpose: A java application that display statistics for 
 employees such as name, salary, position and title.
  
 */


package UEmployee;
import java.util.Scanner;

public class UEmployeeTester {

	
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String dep;
		String dep1;
		String ti;
		
		
		
			System.out.println("testing just UEmployee\n");
			UEmployee Bennett = new UEmployee("Bennett", 35000); 
		
			System.out.println("Emyployees name: " + Bennett.getName()); 
			System.out.println("Emyployees Salary: " + Bennett.getSalary()); 
		
		
		
		System.out.println("");  
		
		
		//
			
			Faculty Ben = new Faculty("Ben", 500000, "Sales");
			
			System.out.println("Emyployees name: " + Ben.getName()); // getting name
			System.out.println("Emyployees Salary: " + Ben.getSalary()); //getting salary
			System.out.println("Emyployees Department: " + Ben.getDepartment()); // getting department
		
			System.out.println("Change department to: ");
			dep = input.nextLine(); // getting the next string from user
			Ben.setDepartment(dep);
			System.out.println("New Department is: " + Ben.getDepartment() );
		
		
		System.out.println(""); 		
		
		
			
			Staff Brennen = new Staff("Emyployees Salary",  750000.00, "marketing", " manager");
		
			System.out.println("Employees Name: " + Brennen.getName()); // getting name
			System.out.println("Emyployees Salary: " + Brennen.getSalary()); //getting salary
			System.out.println("Employees Department: " + Brennen.getDepartment()); // getting department
			System.out.println("Employees Title: "+ Brennen.getTitle());
			
			System.out.println("Change Department to: ");
			dep1 = input.nextLine(); 
			Brennen.setDepartment(dep1);
			System.out.println("New department is: " + Brennen.getDepartment() );
			
			
			System.out.println("change title to: ");
			ti = input.nextLine(); 
			Brennen.setTitle(ti);
			System.out.println("new title is: " + Brennen.getTitle() );
			
			input.close(); 
		
		
		
		
		
		
		
	}

	
}

