package com.sl.product.controller;

import com.sl.product.dto.AddUserDto;
import com.sl.product.dto.LoginDto;
import com.sl.product.dto.ResultUserDto;
import com.sl.product.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：sl
 * @description： 用户控制器
 * @date ： 2020/10/22 14:38
 */
@RestController
@Slf4j(topic = "LogbackController")
@Api(value = "用户信息管理", tags = "用户信息管理")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 获取map
     *
     * @return
     */
    @ApiOperation(value = "获取map", notes = "获取map")
    @GetMapping("/getMap")
    public Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>(4);
        map.put("08:30", "起床");
        map.put("08:50", "出门");
        map.put("09:10", "打卡");
        map.put("18:00", "下班");
        return map;
    }


    /**
     * 根据id查询用户信息
     *
     * @param keyId
     * @return
     */
    @ApiOperation(value = "根据id查询用户信息", notes = "根据id查询用户信息")
    @GetMapping("/getUser/{keyId}")
    public ResultUserDto getUser(@PathVariable @NotNull @Valid @ApiParam(name = "keyId", value = "用户id", required = true) Long keyId) {
        return userService.select(keyId);
    }

    /**
     * 登录
     *
     * @return
     */
    @ApiOperation(value = "登录", notes = "登录")
    @PostMapping("/login")
    public ResultUserDto login(@RequestBody @Valid @ApiParam(name = "LoginDto", value = "登录DTO", required = true) LoginDto loginDto) {
        return userService.login(loginDto.getAccount(), loginDto.getPassword());
    }

    /**
     * 注册
     *
     * @return
     */
    @ApiOperation(value = "注册", notes = "注册")
    @PostMapping("/addUser")
    public void addUser(@RequestBody @Valid @ApiParam(name = "AddUserDto", value = "新增用户DTO", required = true) AddUserDto addUserDto) {
        userService.addUser(addUserDto);
    }
}
