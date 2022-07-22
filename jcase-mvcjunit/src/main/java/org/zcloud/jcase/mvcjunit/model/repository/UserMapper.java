package org.zcloud.jcase.mvcjunit.model.repository;

import org.apache.ibatis.annotations.Mapper;
import org.zcloud.jcase.mvcjunit.model.pojo.User;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
