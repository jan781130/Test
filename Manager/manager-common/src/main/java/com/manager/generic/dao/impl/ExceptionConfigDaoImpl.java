package com.manager.generic.dao.impl;

import org.springframework.stereotype.Repository;

import com.manager.generic.config.SystemErrorMsg;
import com.umdp.generic.dao.ExceptionDao;


@Repository(value = "ExceptionConfigDaoImpl")
public class ExceptionConfigDaoImpl implements ExceptionDao {

	@Override
	public String getErrorMsg(String errorCode) {
		try {
			String errorMsg = SystemErrorMsg.valueOf(errorCode).getErrorMsg();
			return errorMsg;
		} catch (IllegalArgumentException e) {
			return null;
		}

	}

}
