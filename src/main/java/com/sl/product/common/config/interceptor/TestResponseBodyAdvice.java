package com.sl.product.common.config.interceptor;

import com.sl.product.common.constant.RequestStatus;
import com.sl.product.common.constant.RetCode;
import com.sl.product.common.utils.RetResult;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author ：sl
 * @description： 拦截Controller方法默认返回参数，统一处理返回值/响应体
 * @date ： 2020/10/29 15:29
 */
@ControllerAdvice(basePackages = "com.sl.product.controller")
public class TestResponseBodyAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        return new RetResult(RetCode.SUCCESS.getCode(), RequestStatus.REQUEST_TRUE.getCode(), o);
    }
}
