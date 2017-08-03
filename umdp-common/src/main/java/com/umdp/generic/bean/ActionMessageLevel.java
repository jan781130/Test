package com.umdp.generic.bean;

public enum ActionMessageLevel {

	INFO("提示"), 
    WARN("警告"),
    ERROR("錯誤");
    
    private String text;
    
    private ActionMessageLevel(String text) {
        this.text = text;
    }

    /**
     * @return 文字說明
     */
    public String getText() {
        return text;
    }
    
}
