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
    public void insert(){
        User user = new User();
        long start = System.currentTimeMillis();
        userMapper.insert(user);
        long times = System.currentTimeMillis() - start;
        System.out.println(times);
        assertThat(user.getId()).isNotNull();
    }

    @Test
    public void selectList(){
        long start = System.currentTimeMillis();
        List<User> users = userMapper.selectList(null);
        long times = System.currentTimeMillis() - start;
        System.out.println(times);
        assertThat(times).isLessThan(100);
//        users.forEach(System.out::println);
    }
}
