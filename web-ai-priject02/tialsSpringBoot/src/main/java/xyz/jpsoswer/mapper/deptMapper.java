package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xyz.jpsoswer.pojo.Dept;

import java.util.List;

@Mapper
public interface deptMapper {
    @Select("select id,name,create_time,update_time from dept order by update_time desc")
    List<Dept> findAll();
}
