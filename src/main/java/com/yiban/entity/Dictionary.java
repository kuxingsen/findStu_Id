package com.yiban.entity;

/**
 * 字典类，封装所有信息，表示所有常量信息
 */
public enum Dictionary {
    SUCCESS(true,0,"操作成功"),
    MESSAGE_LOSS(false,-1,"缺少必要信息")
    ;
    //是否成功
    private boolean success;
    //消息代码
    private int code;
    //消息内容
    private String stateInfo;

    Dictionary(boolean success, int code, String stateInfo) {
        this.success = success;
        this.code = code;
        this.stateInfo = stateInfo;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
