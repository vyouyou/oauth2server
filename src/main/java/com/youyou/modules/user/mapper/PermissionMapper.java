package com.youyou.modules.user.mapper;

import com.youyou.modules.user.model.RolePermissionModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author qishiyu
 * @create 2019/7/18 9:12
 */
@Mapper
public interface PermissionMapper {

    /**
     * 获取权限
     *
     * @return
     */
    @Select("SELECT A.NAME AS roleName,C.url FROM role AS A LEFT JOIN role_permission B ON A.id=B.role_id LEFT JOIN permission AS C ON B.permission_id=C.id")
    List<RolePermissionModel> getRolePermissions();
}
