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
}
