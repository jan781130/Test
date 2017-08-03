package com.manager.generic.config;

public enum SystemErrorMsg {

	TEST_ERROR_CODE("Test Error Msg");
	
	private String errorMsg;
	
	private SystemErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
		
	public String getErrorMsg() {
		return this.errorMsg;
	}
	
}

