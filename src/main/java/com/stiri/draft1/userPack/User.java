package com.stiri.draft1.userPack;


public class User {
	
	private String userName;
	private String password;
	private String email;
	
	
	
	public User(String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	
	public User() {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean result=Boolean.FALSE;
		
		if(obj instanceof User) {
			User inputObject=(User)obj;
			if(inputObject.getUserName()!=null && inputObject.getPassword()!=null && inputObject.getUserName().equals(this.getUserName()) &&
					inputObject.getPassword().equals(this.getPassword())) {
				result=Boolean.TRUE;
			}
		}
		return result;
	}

	
	@Override
	public String toString() {
		return "Topic [userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}