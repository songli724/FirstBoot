package com.sl.product.mapper;

import com.sl.product.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author ：sl
 * @description：
 * @date ： 2020/10/22 18:44
 */
@Repository
public interface UserMapper {
    /**
     * 根据用户id 查询用户信息
     *
     * @param keyId
     * @return
     */
    User select(Long keyId);

    /**
     * 登录
     *
     * @param accountNumber
     * @param password
     * @return
     */
    User login(String accountNumber, String password);

    /**
     * 账号查重
     *
     * @param accountNumber
     * @return
     */
    User accountRepetition(String accountNumber);


    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    void addUser(User user);
}
