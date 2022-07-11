package com.wx.controller;

import com.wx.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author wangxian
 * @Date 2022/7/10 10:56
 * @Version 1.0
 * @Description
 */
@RestController
public class TestController {

    @Value("${student2.lastName}")
    private String lastName;

    @Value("${student2.date}")
    private Date date;

    @Autowired
    Student student;

    @RequestMapping("test3")
    public String test(){
        System.out.println(student);
        System.out.println(new Student());
        return student.getLastName();
    }

}
