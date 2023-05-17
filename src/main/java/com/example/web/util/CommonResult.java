package com.example.web.util;

/**
 * @author: huanghui
 * 2021/7/26 10:59
 */
public class CommonResult {

    private Integer code = 200;
    private Integer serviceCode = 200;
    private boolean success = true;
    private String message;
    private Object data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(String message, Integer serviceCode) {
        this(message, serviceCode, null);
    }


    public CommonResult(Integer code, String message, Object o) {
        this.code = code;
        this.message = message;
        this.data = o;
    }

    public CommonResult(String message, Integer serviceCode, Object o) {
        this.message = message;
        this.serviceCode = serviceCode;
        this.data = o;
    }

    public CommonResult(Integer code, Integer serviceCode, String message, Object o) {
        this.code = code;
        this.serviceCode = serviceCode;
        this.message = message;
        this.data = o;
    }

    public static CommonResult success() {
        CommonResult result = new CommonResult(200, "操作成功");
        return result;
    }

    public static CommonResult success(Object o) {
        CommonResult result = new CommonResult(200, "操作成功");
        result.setData(o);
        return result;
    }

    public static CommonResult success(Object o, String message) {
        CommonResult result = new CommonResult(200, message);
        result.setData(o);
        return result;
    }

    public static CommonResult failure(String errorMsg) {
        CommonResult result = new CommonResult(200, errorMsg,Boolean.FALSE);
        result.setSuccess(false);
        return result;
    }

    public static CommonResult failure(Integer serviceCode, String errorMsg) {
        CommonResult result = new CommonResult(200, serviceCode, errorMsg, Boolean.FALSE);
        result.setSuccess(false);
        return result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
