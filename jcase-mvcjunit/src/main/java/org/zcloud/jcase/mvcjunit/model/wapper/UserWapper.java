package org.zcloud.jcase.mvcjunit.model.wapper;

import org.zcloud.jcase.mvcjunit.model.pojo.User;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * @author wuzhi liu
 * @create 2022-07-22 08:12
 */
public class UserWapper {

    public static QueryWrapper<User> queryWapper(User user){
        return new QueryWrapper<>(user);
    }
}
