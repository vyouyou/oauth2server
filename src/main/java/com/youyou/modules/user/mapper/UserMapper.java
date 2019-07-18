package com.youyou.modules.user.mapper;

import com.youyou.modules.user.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author qishiyu
 * @create 2019/7/18 14:28
 */
@Mapper
public interface UserMapper {
    /**
     * 根据姓名查询
     *
     * @param username
     * @return
     */
    @Select("select id,username,password from user where username= #{username}")
    UserModel loadUserByUsername(@Param("username") String username);
}
