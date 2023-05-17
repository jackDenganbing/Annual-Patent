package com.example.web.util;

public enum NumEnum {

    FM(1,"发明专利"),
    SYXX(2,"实用新型/外观设计");



    private Integer code;
    private String flow;

    NumEnum(Integer code, String flow) {
        this.code = code;
        this.flow = flow;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }
}
