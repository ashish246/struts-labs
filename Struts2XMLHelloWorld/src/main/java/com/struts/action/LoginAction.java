package com.struts.action;

import com.opensymphony.xwork2.Action;

/**
 * So we can access our application with URL
 * http://localhost:8080/Struts2XMLHelloWorld/User/home.action. Notice that URL
 * is ending with .action that is the default suffix for Struts 2 action like it
 * is .do for Struts 1.
 * 
 * @author Administrator
 *
 */
public class LoginAction implements Action {

	@Override
	public String execute() throws Exception {
		if ("ashish".equals(getName()) && "admin".equals(getPwd()))
			return "SUCCESS";
		else
			return "ERROR";
	}

	// Java Bean to hold the form parameters
	private String name;
	private String pwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}