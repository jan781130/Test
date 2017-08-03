package com.umdp.generic.bean;

import com.umdp.generic.config.ErrorMsgLocation;


@SuppressWarnings("serial")
public class UmingSysException extends RuntimeException {
	
	private String errorCode;
	
	private ErrorMsgLocation msgLocation;
	
    
	public UmingSysException(String errorCode) {
        this.errorCode = errorCode;
    }
	

	public UmingSysException(String errorCode, ErrorMsgLocation msgLocation) {
		this.errorCode = errorCode;
		this.msgLocation = msgLocation;
    }
	
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public ErrorMsgLocation getMsgLocation() {
		return msgLocation;
	}
	
	public void setMsgLocation(ErrorMsgLocation msgLocation) {
		this.msgLocation = msgLocation;
	}
}
