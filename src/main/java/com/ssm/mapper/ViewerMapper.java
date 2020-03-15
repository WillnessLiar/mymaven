package com.ssm.mapper;

import com.ssm.po.Viewer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ViewerMapper {
    @Insert("insert into viewer(vname,vemail,vphone,vmessage) values (#{vname},#{vemail},#{vphone},#{vmessage})")
    void insertViewer(Viewer viewer);

    @Select("SELECT vname,vemail,vphone,vmessage FROM Viewer")
    List<Viewer> selectViewerAll();

    @Delete("delete from Viewer where vphone=#{value}")
    void deleteViewerByVphone(String vphone);
}
