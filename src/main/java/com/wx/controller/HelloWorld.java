package com.wx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wangxian
 * @Date 2022/7/8 23:41
 * @Version 1.0
 * @Description
 */
@RestController
public class HelloWorld {

    @GetMapping("hello")
    public String Test(){
        return "HelloSpringBoot";
    }

}
