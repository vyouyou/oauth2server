package com.youyou.modules.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qishiyu
 * @create 2019/7/17 20:34
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/")
    public String getOrder() {
        return "1";
    }
}
