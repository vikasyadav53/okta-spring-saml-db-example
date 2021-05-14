package com.okta.developer.controller.model;

/**
 * @author jcavazos
 */

public class DbAuthCredentials {
    private String username;
    private String password;
    
	public DbAuthCredentials() {
	}

	public DbAuthCredentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
    
    
}
