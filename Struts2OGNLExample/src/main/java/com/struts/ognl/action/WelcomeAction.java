package com.struts.ognl.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.ognl.model.MyJavaBean;

public class WelcomeAction extends ActionSupport implements
		ModelDriven<MyJavaBean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() {
		return SUCCESS;
	}

	private MyJavaBean bean = new MyJavaBean();

	@Override
	public MyJavaBean getModel() {
		return bean;
	}

}