package com.sl.product.common.constant;

/**
 * @author ：sl
 * @description：
 * @date ： 2020/10/23 13:29
 */
public enum RequestStatus {
    //成功
    REQUEST_TRUE("请求成功"),

    //失败
    REQUEST_FELSE("请求失败");

    private String code;

    private RequestStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
