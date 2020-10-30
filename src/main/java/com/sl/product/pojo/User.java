package com.sl.product.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：sl
 * @date ： 2020/10/22 18:37
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 3639290930514753628L;

    /**
     * 主键
     */
    private Long keyId;
    /**
     * 账号
     */
    private String accountNumber;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 注册时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date registerTime;
    /**
     * 密码
     */
    private String password;
    /**
     * 删除标识符
     */
    private String delStatus;
}
