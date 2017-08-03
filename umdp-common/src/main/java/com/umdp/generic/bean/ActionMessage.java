package com.umdp.generic.bean;

/**
 * Action 的訊息物件
 * @author Tabris
 */
public class ActionMessage {

	private String level;
    private String msg;
    private String errorCode;
    
    public ActionMessage() {
        this(ActionMessageLevel.INFO, null);
    }
    
    
    public ActionMessage(String msg) {
        this(ActionMessageLevel.INFO, msg);
    }

    
    public ActionMessage(ActionMessageLevel level, String msg) {
        if (level == null) {
            this.level = ActionMessageLevel.INFO.getText();
        } else {
            this.level = level.getText();
        }
        this.msg = msg;
    }
    
    public ActionMessage(ActionMessageLevel level, String msg, String errorCode) {
        if (level == null) {
            this.level = ActionMessageLevel.INFO.getText();
        } else {
            this.level = level.getText();
        }
        this.msg = msg;
        
        this.errorCode=errorCode;
    }
    /**
     * @return 訊息等級
     */
    public String getLevel() {
        return level;
    }
    /**
     * @param level : 訊息等級
     */
    public void setLevel(String level) {
        this.level = level;
    }
    /**
     * @return 訊息內容
     */
    public String getMsg() {
        return msg;
    }
    /**
     * @param msg : 訊息內容
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }


	public String getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
    
}
