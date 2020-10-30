package com.sl.product.service.Impl;

import com.sl.product.common.exception.BusinessException;
import com.sl.product.dto.AddUserDto;
import com.sl.product.dto.ResultUserDto;
import com.sl.product.mapper.UserMapper;
import com.sl.product.pojo.User;
import com.sl.product.service.UserService;
import com.sl.product.common.utils.KeyIdUtils;
import com.sl.product.common.constant.Constant;
import com.sl.product.common.dozer.generator.IGenerator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Objects;

/**
 * @author ：sl
 * @description：
 * @date ： 2020/10/22 18:47
 */
@Service
public class UserServiceImpl implements UserService {
    private static Logger logger = Logger.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IGenerator iGenerator;


    @Override
    public ResultUserDto select(Long keyId) {
        throw new BusinessException("1","用户不存在！");
//        ResultUserDto user = iGenerator.convert(userMapper.select(keyId), ResultUserDto.class);
//        if (Objects.isNull(user)) {
//            throw new BusinessException("1","用户不存在！");
//        }
//        logger.info("查询用户成功");
//        return user;
    }

    @Override
    public ResultUserDto login(String accountNumber, String password) {
        ResultUserDto user = iGenerator.convert(userMapper.login(accountNumber, password), ResultUserDto.class);
        if (Objects.isNull(user)) {
//            throw new Throwable("账号或密码错误！");
        }
        logger.info("用户登录成功");
        return user;
    }

    @Override
    public void addUser(AddUserDto addUserDto) {
        User user = new User();
        user.setKeyId(KeyIdUtils.getKeyId());
        user.setAccountNumber(addUserDto.getAccountNumber());
        user.setNickName(addUserDto.getNickName());
        if (addUserDto.getAvatar() != null && addUserDto.getAvatar() != "") {
            user.setAvatar(addUserDto.getAvatar());
        }
        user.setRegisterTime(new Date());
        user.setPassword(addUserDto.getPassword());
        user.setDelStatus(Constant.DATA_NORMAL_STATUS);
        try {
            userMapper.addUser(user);
            logger.info("用户注册成功");
        } catch (Exception e) {
//            throw new Throwable("注册失败！");
        }
    }
}
