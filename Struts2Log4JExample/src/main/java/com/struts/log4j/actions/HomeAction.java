package com.struts.log4j.actions;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(HomeAction.class);

	public String execute() {
		System.out.println("SYSOUT: inside HomeAction execute method");
		logger.error("inside HomeAction execute method");
		return SUCCESS;
	}
}