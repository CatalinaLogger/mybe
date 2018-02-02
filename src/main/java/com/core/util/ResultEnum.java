package com.core.util;

public enum ResultEnum {

    SUCCESS(0,"请求成功"),
    ERROR_SYSTEM(-1,"系统异常"),
    ERROR_FIRST(-10,"儿童劫"),
    ERROR_SECOND(-20,"托儿所"),
    ERROR_THIRD(-30,"小学僧"),
    ERROR_FOURTH(-40,"666");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
