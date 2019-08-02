package com.ssm.controller;


import com.ssm.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;

    @RequestMapping("/getUser")
    public String getUser() {
        return "name: " + name + ";age:" + age;
    }

    @Autowired
    private Person person;

    @RequestMapping("/getPerson")
    public String getPerson() {
        return person.toString();
    }
//    @RequestMapping("/hello")
//    public String Hello(String name) {
//        return "Hello " + name;
//    }
}