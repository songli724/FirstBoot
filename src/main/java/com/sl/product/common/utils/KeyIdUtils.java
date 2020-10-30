package com.sl.product.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：sl
 * @description：
 * @date ： 2020/10/23 12:26
 */
public class KeyIdUtils {
    public static Long getKeyId() {
        SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmmssSSS");
        String pkPrefix = df.format(new Date());
        int randomNum = (int) (Math.random() * 10000.0D);
        long l = Long.valueOf(pkPrefix + String.format("%1$04d", randomNum));
        return l;
    }
}
