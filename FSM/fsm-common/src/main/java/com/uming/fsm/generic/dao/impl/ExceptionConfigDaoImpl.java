package com.uming.fsm.generic.dao.impl;

import org.springframework.stereotype.Repository;

import com.umdp.generic.dao.ExceptionDao;
import com.uming.fsm.generic.config.SystemErrorMsg;


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
