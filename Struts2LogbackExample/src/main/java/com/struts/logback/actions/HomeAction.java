package com.struts.logback.actions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory
			.getLogger(HomeAction.class);

	public String execute() {
		System.out.println("SYSOUT: inside HomeAction execute method");
		logger.error("inside HomeAction execute method");
		return SUCCESS;
	}
}