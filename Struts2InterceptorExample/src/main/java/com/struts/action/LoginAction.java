package com.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.bean.User;

public class LoginAction extends ActionSupport implements SessionAware,
		ModelDriven<User> {

	private static final long serialVersionUID = -3369875299120377549L;

	@Override
	public String execute() {
		System.out.println("inside execute");
		if ("ashish".equals(user.getUser())
				&& "admin".equals(user.getPassword())) {
			user.setUserName("Ashish Tripathi");
			sessionAttributes.put("USER", user);
			return SUCCESS;
		}
		return INPUT;
	}

	private User user = new User();
	private Map<String, Object> sessionAttributes = null;

	@Override
	public void setSession(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}

	@Override
	public User getModel() {
		return user;
	}

}