package com.ssm.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface PhotoMapper {

    @Insert("insert into photo(pdata,msg) values (#{pdata},#{msg})")
    void insert_photo(Map<String,Object> photo);
    @Select("select * from photo")
    List<Map<String,Object>> select_photo();
}
