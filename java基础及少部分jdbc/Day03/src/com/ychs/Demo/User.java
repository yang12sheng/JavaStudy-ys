/**
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>  
 * <p>Company: yckj</p>
 * @version 1.0   
 */
package com.ychs.Demo;

/**	
 * @author ysheng
 * @date 2021年7.29
 */
public class User {
	private String username;
	private String password;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(obj==this) {
			return true;
		}
		if(obj instanceof User) {
			User u = (User) obj;
			return this.username.equals(u.username)&&this.password.equals(u.password);
		}
		return false;
	}
	
}






