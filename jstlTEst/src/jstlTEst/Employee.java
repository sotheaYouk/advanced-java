package jstlTEst;

import java.io.Serializable;

public class Employee implements Serializable 
{
	private int id =0;
	private String user = "";
	
	public Employee(int id, String user) {
		this.id = id;
		this.user = user;
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
	
	
	@Override 
	public String toString()
	{
		return "id: " + id + " user: " + user;
	}
	
	

}
