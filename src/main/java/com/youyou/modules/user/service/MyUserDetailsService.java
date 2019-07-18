package com.youyou.modules.user.service;

import com.youyou.modules.user.mapper.RoleMapper;
import com.youyou.modules.user.mapper.UserMapper;
import com.youyou.modules.user.model.RoleModel;
import com.youyou.modules.user.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.management.relation.Role;
import java.util.List;

/**
 * @Author qishiyu
 * @create 2019/7/18 9:05
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserModel userModel = userMapper.loadUserByUsername(userName);
        if (null != userModel) {
            List<RoleModel> roleList = roleMapper.getRolesByUserId(userModel.getId());
            userModel.setAuthorities(roleList);
        }
        return userModel;
    }

}
