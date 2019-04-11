package mvcDemo;

public class StudentModel 
{
	private String username;

	public String getUser() {
		return username;
	}

	public void setUser(String user) {
		username = user;
	}
	
	
	public boolean checkValues(StudentModel username)
	{
		if(username.getUser().equals("sothea"))
			return true;
		else 
			return false;
	
		
	}
	
	

}
