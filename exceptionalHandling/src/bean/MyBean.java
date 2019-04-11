package bean;

import java.io.Serializable;

public class MyBean implements Serializable
{
	private int id= 0;
	private String user ="";
	
	
	public MyBean() {
		super();
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}

	
}
