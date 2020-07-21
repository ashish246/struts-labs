package com.struts.actions;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.Action;
import com.struts.bean.User;

@org.apache.struts2.convention.annotation.Action("loginObject")
@Namespace("/object")
@ResultPath("/")
@Results({ @Result(name = "success", location = "homeObject.jsp"),
		@Result(name = "input", location = "loginObject.jsp") })
public class LoginObjectBackedAction implements Action {

	@Override
	public String execute() throws Exception {
		if ("ashish".equals(getUser().getUserID())
				&& "admin".equals(getUser().getPassword())) {
			getUser().setUserName("Ashish Tripathi");
			return SUCCESS;
		} else {
			return INPUT;
		}
	}

	/**
	 * he only point to note is the variable name of User bean “user”. We have
	 * to use the same name in request and response pages. Let’s look at the
	 * request and response JSP pages.
	 */
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}