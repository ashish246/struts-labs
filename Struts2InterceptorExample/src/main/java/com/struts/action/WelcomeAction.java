package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.bean.User;
import com.struts.interceptor.UserAware;

public class WelcomeAction extends ActionSupport implements UserAware,
		ModelDriven<User> {

	private static final long serialVersionUID = 8111120314704779336L;

	@Override
	public String execute() {
		return SUCCESS;
	}

	private User user;

	@Override
	public void setUser(User user) {
		this.user = user;
	}

	public User getUser(User user) {
		return this.user;
	}

	@Override
	public User getModel() {
		return this.user;
	}

}