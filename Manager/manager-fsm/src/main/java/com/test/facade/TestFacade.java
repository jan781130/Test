package com.test.facade;

import java.util.List;

import com.test.bean.User;

public interface TestFacade {
	
	 List<User> getAllUser();
	
	 User getUserById(Integer id);
}
