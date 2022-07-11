package com.wx;

import com.wx.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringBootDemoApplication.class)
//@SpringBootTest
class SpringBootDemoApplicationTests {

    @Autowired
    private TestController testController;

    @Test
    void contextLoads() {
        System.out.println("测试。。。。");
        System.out.println(testController);
    }

}
