package com.sl.product.common.exception;

import lombok.Data;

/**
 * @author ：sl
 * @description： 业务异常
 * @date ： 2020/10/29 16:19
 */
@Data
public class BusinessException extends RuntimeException {
    private String code;
    private String message;


    public BusinessException(String code, String message1) {
        this.code = code;
        this.message = message1;
    }

    public BusinessException(String message, String code, String message1) {
        super(message);
        this.code = code;
        this.message = message1;
    }

    public BusinessException(String message, Throwable cause, String code, String message1) {
        super(message, cause);
        this.code = code;
        this.message = message1;
    }

    public BusinessException(Throwable cause, String code, String message) {
        super(cause);
        this.code = code;
        this.message = message;
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String code, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.message = message1;
    }
}
