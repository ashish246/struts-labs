package com.hibernate.dao;

import com.hibernate.model.User;

public interface UserDAO {

	User getUserByCredentials(String userId, String password);
}