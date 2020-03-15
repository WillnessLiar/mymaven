package com.ssm.mapper;

import com.ssm.po.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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

    @Select({"SELECT * from user where username=#{username}"})
    Map<String,Object> selectByUsername(String username);
    @Insert("insert into user(id,name,password,age,role,username) values (#{id},#{name},#{password},#{age},#{role},#{username})")
    void register(Map<String,Object> objMap);




//    <!-- 新增用户，用遍历Map的key和value的方式，可以实现只插入有效值 -->
//        <insert id="insertUser" parameterType="java.util.Map">
//    insert into user (
//            <foreach collection="columnMap" item="value" index="key" separator=",">
//            ${key}
//            </foreach>
//            )
//    values (
//            <foreach collection="columnMap" item="value" index="key" separator=",">
//            #{value}
//            </foreach>
//            )
//        </insert>
}


