package com.light.limiter.utils;

public enum BatchEnum {
    
    /**��Ʒ*/
    BATCH_CLASS_PROJECT("0","��Ʒ"),
    /**ͨ��*/
    BATCH_CLASS_WAY("1","ͨ��"),
    /**����*/
    BATCH_CLASS_ORG("2","����");
    
    /**��Ա����*/ 
    private String code;
    private String msg;
 /**���췽��*/ 
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
