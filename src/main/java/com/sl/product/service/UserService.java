package com.sl.product.service;

import com.sl.product.dto.AddUserDto;
import com.sl.product.dto.ResultUserDto;

/**
 * @author ：sl
 * @description：
 * @date ： 2020/10/22 18:43
 */
public interface UserService {
    /**
     * 根据用户id 查询用户信息
     *
     * @param keyId
     * @return
     * @throws Throwable
     */
     ResultUserDto select(Long keyId) ;

    /**
     * 登录
     *
     * @param accountNumber
     * @param password
     * @return
     * @throws Throwable
     */
     ResultUserDto login(String accountNumber, String password);

    /**
     * 新增用户
     *
     * @param addUserDto
     * @return
     * @throws Throwable
     */
    void addUser(AddUserDto addUserDto);
}
