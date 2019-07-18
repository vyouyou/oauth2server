package com.youyou.modules.user.mapper;

import com.youyou.modules.user.model.RoleModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.management.relation.Role;
import java.util.List;

/**
 * @Author qishiyu
 * @create 2019/7/18 14:23
 */
@Mapper
public interface RoleMapper {

    /**
     * 根据userId查询对应的roles
     *
     * @param userId
     * @return
     */
    @Select("SELECT A.id,A.name FROM role A LEFT JOIN user_role B ON A.id=B.role_id WHERE B.user_id=#{userId}")
    List<RoleModel> getRolesByUserId(@Param("userId") Long userId);
}
