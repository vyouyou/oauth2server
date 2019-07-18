package com.youyou.modules.user.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * @Author qishiyu
 * @create 2019/7/18 9:09
 */
@Data
public class RoleModel implements GrantedAuthority {
    private Long id;
    private String name;
    @Override
    public String getAuthority() {
        return name;
    }
}
