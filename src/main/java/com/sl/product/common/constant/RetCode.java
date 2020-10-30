package com.sl.product.common.constant;

/**
 * @author ：sl
 * @description：
 * @date ： 2020/10/23 13:19
 */
public enum RetCode {
    //成功
    SUCCESS(200),

    //内部错误
    ERROR(500);

    private int code;

    private RetCode(Integer code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
