package com.youyou.oauth2server;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author qishiyu
 * @create 2019/7/18 16:06
 */
public class BCryptPasswordEncoderTest {
    @Test
    public void bcryptEncode(){
        System.out.println(new BCryptPasswordEncoder().encode("dev"));
    }
}
