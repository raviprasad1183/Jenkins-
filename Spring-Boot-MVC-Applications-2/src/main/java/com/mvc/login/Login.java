package com.mvc.login;

public class Login {
	private String name;
	private String password;
	
	public Login() {
		super();
	}

	public Login(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [name=" + name + ", password=" + password + "]";
	}
	
	

}
