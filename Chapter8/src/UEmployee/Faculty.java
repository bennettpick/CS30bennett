package UEmployee;
public class Faculty extends UEmployee {

	
	private String department;
	
	public Faculty(String N, double S, String D) { 
		super(N,S);
		department = D;
		
	}
	
	public void setDepartment(String de) {
		department = de;
	}
	
	public String getDepartment() {
		return department;
	}
	
	
	
	
	
}


