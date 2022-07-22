package org.zcloud.jcase.mvcjunit.service;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.zcloud.jcase.mvcjunit.model.pojo.User;
import org.zcloud.jcase.mvcjunit.model.repository.UserMapper;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import static org.mockito.Mockito.when;

/**
 * @author wuzhi liu
 * @create 2022-07-22 08:20
 */
@SpringBootTest
public class ServiceTest {
    @MockBean
    UserMapper userMapper;
    @Autowired
    UserService userService;

    @Test
    public void users(){
        when(userMapper.selectList(Wrappers.emptyWrapper())).thenReturn(Arrays.asList(new User()));
        List<User> list = userService.list();
        list.forEach(System.out::println);
    }
}
