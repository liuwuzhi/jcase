package org.zcloud.jcase.mvcjunit.model;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.zcloud.jcase.mvcjunit.model.pojo.User;
import org.zcloud.jcase.mvcjunit.model.repository.UserMapper;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * @author wuzhi liu
 * @create 2022-07-21 11:32
 */
@MybatisPlusTest
public class MyBatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectList(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    public void insert(){
        User user = new User();
        userMapper.insert(user);
        assertThat(user.getId()).isNotNull();
    }
}
