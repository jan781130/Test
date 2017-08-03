package com.test.dao;

import java.util.List;

import com.test.bean.User;


public interface TestDao {
	
	
	List<User> findAllUser();
	
	User findUserById(Integer id);
	
	void addUser(User user);
}
