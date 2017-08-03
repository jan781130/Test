package com.manager.generic.action;

import java.util.HashMap;

import com.umdp.generic.bean.ActionMessage;
import com.umdp.generic.bean.ActionResult;
import com.umdp.generic.bean.ActionStatusCode;



public class BaseAction {
	/**
	 * 只回傳成功狀態
	 * @author Tabris
	 * @return
	 */
	public HashMap<String, ActionResult> getReturnAttribute() {
		return this.getReturnAttribute(ActionStatusCode.OK, null, null);
	}
	
	
	/**
	 * 回傳成功狀態並把 message 傳到前端
	 * @author Tabris
	 * @param message 回傳訊息
	 * @return
	 */
	public HashMap<String, ActionResult> getReturnAttribute(String message) {
		return this.getReturnAttribute(ActionStatusCode.OK, null, new ActionMessage(message));
	}
	
	
	/**
	 * 回傳成功狀態並把 data 傳到前端
	 * @author Tabris
	 * @param data 回傳資料
	 * @return
	 */
	public HashMap<String, ActionResult> getReturnAttribute(Object data) {
		return this.getReturnAttribute(ActionStatusCode.OK, data, null);
	}
	
	
	/**
	 * 回傳狀態並把 data 傳到前端
	 * @author Tabris
	 * @param status 回傳前端狀態
	 * @param data 回傳資料
	 * @return
	 */
	public HashMap<String, ActionResult> getReturnAttribute(ActionStatusCode status, Object data) {
		return this.getReturnAttribute(status, data, null);
	}
	
	
	/**
	 * 回傳 data 與 message 傳到前端
	 * @author Tabris
	 * @param data 回傳資料
	 * @param message 回傳訊息
	 * @return
	 */
	public HashMap<String, ActionResult> getReturnAttribute(Object data, String message) {
		return this.getReturnAttribute(ActionStatusCode.OK, data, new ActionMessage(message));
	}
	
	
	/**
	 * 回傳 status、data 與 message 傳到前端
	 * @author Tabris
	 * @param status 回傳前端狀態
	 * @param data 回傳資料
	 * @param message 回傳訊息
	 * @return
	 */
	@SuppressWarnings("serial")
	public HashMap<String, ActionResult> getReturnAttribute(final ActionStatusCode status, final Object data, final ActionMessage message) {
		return new HashMap<String, ActionResult>() {{
			put("result", new ActionResult(status.getStatusCode(), data, message));
		}};
	}
	
}
