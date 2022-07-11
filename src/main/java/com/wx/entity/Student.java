package com.wx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author wangxian
 * @Date 2022/7/10 16:12
 * @Version 1.0
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
//@PropertySource("classpath:config/student.yml")
@ConfigurationProperties(prefix = "student")
public class Student {

    private String lastName;
    private Integer age;
    private Boolean boss;

    private Date birthday;
    private Map<String,String> maps;
    private Map<String,String> maps2;
    private List<Dog> list;

    private String[] arr;
    private String[] arr2;
    private  Map<String,String> dogMap;

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Dog{
    private String name;
    private Integer age;
}