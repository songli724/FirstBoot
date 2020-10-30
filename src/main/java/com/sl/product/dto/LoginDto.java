package com.sl.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ：sl
 * @description：.
 * @date ： 2020/10/23 14:02
 */
@Data
@ApiModel("登录DTO")
public class LoginDto implements Serializable {
    private static final long serialVersionUID = -1736413300541651940L;
    /**
     * 账号
     */
    @NotNull
    @ApiModelProperty(value = "账号", required = true)
    private String account;
    /**
     * 密码
     */
    @NotNull
    @ApiModelProperty(value = "密码", required = true)
    private String password;
}
