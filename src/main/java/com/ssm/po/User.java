package com.ssm.po;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.io.Serializable;

public class User implements Serializable {
    @NotNull(message = "id为空！！！") //非空校验
    private Integer id;
    @Length(min = 1,max = 8)
    private String name;
    @NotEmpty(message = "密码为空！！！")  //字符串非空校验，NotBlank去收尾空格
    @Length(min = 1,max = 16)
    private String password;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(Integer id, String name, String password, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }
}