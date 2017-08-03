package com.test.service;

import java.util.List;

import com.test.bean.User;

public interface TestService {

	List<User> getAllUser();
	
	User getUserById(Integer id);
}
