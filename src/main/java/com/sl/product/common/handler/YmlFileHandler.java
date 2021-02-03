package com.sl.product.common.handler;

import com.sl.product.common.constant.Constant;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：sl
 * @description：yml文件处理器
 * @date ： 2020/10/30 15:14
 */
@Component
@ConfigurationProperties(prefix = "custom-exception")
@Data
public class YmlFileHandler {

    private Map<String, String> codes = new HashMap<>();

    /**
     * 获取yml文件的异常信息
     *
     * @param code
     * @param message
     * @return
     */
    public String getCustomException(String code, String message) {
        String value = codes.get(code);
        if (StringUtils.isNotBlank(value)) {
            if (value.contains(Constant.ERR_MESSAGE_WILDCARD_CHARACTER)) {
                return value.replace(Constant.ERR_MESSAGE_WILDCARD_CHARACTER, message);
            } else {
                return value.replace(Constant.ERR_MESSAGE_WILDCARD_CHARACTER, "");
            }
        } else {
            return codes.get(Constant.ERR_MESSAGE_CODE);
        }
    }
}
