package com.manager.generic.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.umdp.generic.dao.ExceptionDao;





@Repository(value="ExceptionDBDaoImpl")
@Transactional
public class ExceptionDBDaoImpl implements ExceptionDao{

	@Override
	public String getErrorMsg(String errorCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
