package com.umdp.generic.bean;

/**
 * Action 的狀態代碼
 * @author Tabris
 */
public enum ActionStatusCode {

	OK("200"),
	BadRequest("404"),
	ServerError("500");
	
	private String code;
	
	private ActionStatusCode(String code) {
		this.code = code;
	}
	
	
	public String getStatusCode() {
		return this.code;
	}
	
}
