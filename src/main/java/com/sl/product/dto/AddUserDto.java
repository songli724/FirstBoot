package com.sl.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ：sl
 * @date ： 2020/10/22 18:37
 */
@Data
@ApiModel("新增用户DTO")
public class AddUserDto implements Serializable {

    private static final long serialVersionUID = 3639290930514753628L;

    /**
     * 账号
     */
    @NotNull
    @ApiModelProperty(value = "账号", required = true)
    private String accountNumber;
    /**
     * 昵称
     */
    @NotNull
    @ApiModelProperty(value = "昵称", required = true)
    private String nickName;
    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;
    /**
     * 密码
     */
    @NotNull
    @ApiModelProperty(value = "密码", required = true)
    private String password;

}
