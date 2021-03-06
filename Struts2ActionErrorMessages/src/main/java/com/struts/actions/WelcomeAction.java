package com.struts.actions;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {
		return SUCCESS;
	}

	@Override
	public void validate() {
		if ("ajayta".equalsIgnoreCase(getUsername())
				&& "admin".equalsIgnoreCase(getPassword())) {
			addActionMessage("Welcome Admin, do some work.");
		} else {
			if (!"ajayta".equalsIgnoreCase(getUsername())) {
				addActionError("User name is not valid");
			}
			if (!"admin".equalsIgnoreCase(getPassword())) {
				addActionError("Password is wrong");
			}
		}
	}

	// java bean properties
	private String username;
	private String password;

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