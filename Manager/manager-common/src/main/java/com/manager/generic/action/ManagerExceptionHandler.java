package com.manager.generic.action;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.umdp.generic.action.BaseAction;
import com.umdp.generic.bean.ActionMessage;
import com.umdp.generic.bean.ActionMessageLevel;
import com.umdp.generic.bean.ActionResult;
import com.umdp.generic.bean.ActionStatusCode;
import com.umdp.generic.bean.UmingSysException;
import com.umdp.generic.config.ErrorMsgLocation;
import com.umdp.generic.dao.ExceptionDao;


@ControllerAdvice
public class ManagerExceptionHandler extends BaseAction{
    
	@Autowired
	@Qualifier("ExceptionConfigDaoImpl")
	private ExceptionDao exceptionConfigDao;
	
	@Autowired
	@Qualifier("ExceptionDBDaoImpl")
	private ExceptionDao exceptionDBDao;
		
	private String errorMsg;
	
	@ExceptionHandler(value = UmingSysException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public HashMap<String, ActionResult> SysExceptionhandler(final UmingSysException e) {
		
		this.errorMsg =(e.getMsgLocation() == ErrorMsgLocation.SYSTEM) ? (exceptionConfigDao.getErrorMsg(e.getErrorCode())) : (exceptionDBDao.getErrorMsg(e.getErrorCode()));	
		return super.getReturnAttribute(ActionStatusCode.ServerError, null, new ActionMessage(ActionMessageLevel.ERROR, this.errorMsg , ActionStatusCode.ServerError.getStatusCode()));

		
    }
	
	@ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public HashMap<String, ActionResult> Exceptionhandler(final Exception e) {		
		this.errorMsg = "系統發生異常錯誤，請洽系統維護人員。";	
		return super.getReturnAttribute(ActionStatusCode.ServerError, null, new ActionMessage(ActionMessageLevel.ERROR, this.errorMsg , ActionStatusCode.ServerError.getStatusCode()));		
    }
}
