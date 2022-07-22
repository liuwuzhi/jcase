package org.zcloud.jcase.mvcjunit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zcloud.jcase.mvcjunit.model.pojo.User;
import org.zcloud.jcase.mvcjunit.model.repository.UserMapper;
import org.zcloud.jcase.mvcjunit.service.UserService;

/**
 * @author wuzhi liu
 * @create 2022-07-21 08:52
 */
@RestController
public class Controller {
    @Autowired
    UserService userService;

    @GetMapping
    public List<String> index(){
        return Arrays.asList("Hello World", "!!!");
    }

    @GetMapping("users")
    public List<User> users(){
        return userService.userList();
    }
}
