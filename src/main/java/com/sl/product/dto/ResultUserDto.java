package com.sl.product.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：sl
 * @description： 用户返回结果集
 * @date ： 2020/10/28 17:54
 */
@Data
@ApiModel("用户返回结果集")
public class ResultUserDto implements Serializable {
    private static final long serialVersionUID = 6042387056183064218L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Long keyId;

    /**
     * 账号
     */
    @ApiModelProperty(value = "账号")
    private String accountNumber;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String nickName;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 注册时间
     */
    @ApiModelProperty(value = "注册时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date registerTime;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 删除标识符
     */
    @ApiModelProperty(value = "删除标识符")
    private String delStatus;
}
