package UEmployee;
public class Staff extends Faculty{

	//
	
	
	private String Title;
	
	
	public Staff(String N, Double S, String D, String T) {
		super(N,S, D); 
		Title = T; 
	}
	
	public void setTitle(String ti) {
		Title = ti;
	}
	
	public String getTitle() {
		return Title; 
	}
	
}
	

