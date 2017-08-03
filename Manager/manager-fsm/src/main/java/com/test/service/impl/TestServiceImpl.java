package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.User;
import com.test.dao.TestDao;
import com.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;
	
	@Override
	public List<User> getAllUser() {
		return testDao.findAllUser();
	}

	@Override
	public User getUserById(Integer id) {
		return testDao.findUserById(id);
	}

}
