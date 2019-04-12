package com.light.limiter.utils;

public enum BatchEnum {
    
    /**产品*/
    BATCH_CLASS_PROJECT("0","产品"),
    /**通道*/
    BATCH_CLASS_WAY("1","通道"),
    /**机构*/
    BATCH_CLASS_ORG("2","机构");
    
    /**成员变量*/ 
    private String code;
    private String msg;
 /**构造方法*/ 
    private BatchEnum(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
