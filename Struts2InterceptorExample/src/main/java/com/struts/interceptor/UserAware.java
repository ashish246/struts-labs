package com.struts.interceptor;

import com.struts.bean.User;

public interface UserAware {
	 
    public void setUser(User user);
}