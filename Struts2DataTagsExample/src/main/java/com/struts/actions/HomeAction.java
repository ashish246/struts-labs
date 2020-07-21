package com.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.User;

public class HomeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {
		user = new User();
		user.setName("Ashish Tripathi");
		user.setGender("Male");

		return SUCCESS;
	}

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}