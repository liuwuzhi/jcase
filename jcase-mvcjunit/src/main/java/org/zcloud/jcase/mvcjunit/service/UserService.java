package org.zcloud.jcase.mvcjunit.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zcloud.jcase.mvcjunit.model.pojo.User;
import org.zcloud.jcase.mvcjunit.model.repository.UserMapper;
import org.zcloud.jcase.mvcjunit.model.wapper.UserWapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author wuzhi liu
 * @create 2022-07-22 08:04
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    public List<User> userList(){
        return this.list();
    }

    public List<User> userList(User user){
        return this.list(UserWapper.queryWapper(user));
    }

}
