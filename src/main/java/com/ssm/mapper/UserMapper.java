package com.ssm.mapper;

import com.ssm.po.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Insert("insert into user(id,name,password,age) values (#{id},#{name},#{password},#{age})")
    void insertUser(User user);

    @Select("SELECT ID,NAME,PASSWORD,AGE FROM USER")
    List<User> selectUserAll();

    @Select("SELECT ID,NAME,PASSWORD,AGE FROM USER WHERE ID = #{value}")
    User selectUserById(Integer id);

    @Update("update user set name=#{name},password=#{password},age=#{age} where id=#{id}")
    void updateUser(User user);

    @Delete("delete from user where id=#{value}")
    void deleteUserById(Integer id);
}