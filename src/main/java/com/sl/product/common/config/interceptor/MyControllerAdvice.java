package com.sl.product.common.config.interceptor;

import com.sl.product.common.constant.RetCode;
import com.sl.product.common.exception.BusinessException;
import com.sl.product.common.handler.YmlFileHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：sl
 * @description： controller 增强器
 * @date ： 2020/10/29 16:24
 */
@RestControllerAdvice
public class MyControllerAdvice {

    @Autowired
    private YmlFileHandler ymlFileHandler;

    /**
     * 全局异常捕捉处理
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    public Map errorHandler(BusinessException ex) {
        Map map = new HashMap(2);
        map.put("code", RetCode.ERROR.getCode());
        map.put("msg", ymlFileHandler.getCustomException(ex.getCode(), ex.getMessage()));
        return map;
    }
}
