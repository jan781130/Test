package com.umdp.generic.bean;

public class ActionResult {

	private String status;

	private Object datas;

	private ActionMessage message;

	
	public ActionResult() {
	}
	
	
	public ActionResult(String status) {
		this(status, null, null);
	}
	
	
	public ActionResult(String status, Object datas) {
		this(status, datas, null);
	}

	
	public ActionResult(String status, Object datas, ActionMessage message) {
		this.status = status;
		this.datas = datas;
		this.message = message;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Object getDatas() {
		return datas;
	}


	public void setDatas(Object datas) {
		this.datas = datas;
	}


	public ActionMessage getMessage() {
		return message;
	}


	public void setMessage(ActionMessage message) {
		this.message = message;
	}

}
