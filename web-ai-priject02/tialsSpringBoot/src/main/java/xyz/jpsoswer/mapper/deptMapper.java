package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xyz.jpsoswer.pojo.Dept;

import java.util.List;

@Mapper
public interface deptMapper {


    //查询语句
    @Select("select id,name,create_time,update_time from dept order by update_time desc")
    List<Dept> findAll();

    //删除语句
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);
}
