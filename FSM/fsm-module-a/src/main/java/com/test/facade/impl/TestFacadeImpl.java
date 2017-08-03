package com.test.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.bean.User;
import com.test.facade.TestFacade;
import com.test.service.TestService;

@Component
public class TestFacadeImpl implements TestFacade{
    
	@Autowired
	private TestService testService;
	
	@Override
	public List<User> getAllUser() {
		return testService.getAllUser();
	}

	@Override
	public User getUserById(Integer id) {
		return testService.getUserById(id);
	}

}
