package com.struts.actions;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.bean.User;

@org.apache.struts2.convention.annotation.Action("loginModelDriven")
@Namespace("/")
@ResultPath("/")
@Results({ @Result(name = "success", location = "homeModelDriven.jsp"),
		@Result(name = "input", location = "loginModelDriven.jsp") })
public class LoginModelDrivenAction implements Action, ModelDriven<User> {

	@Override
	public String execute() throws Exception {
		if ("ashish".equals(user.getUserID())
				&& "admin".equals(user.getPassword())) {
			user.setUserName("Ashish Tripathi");
			return SUCCESS;
		} else {
			return INPUT;
		}
	}

	@Override
	public User getModel() {
		return user;
	}

	private User user = new User();

}