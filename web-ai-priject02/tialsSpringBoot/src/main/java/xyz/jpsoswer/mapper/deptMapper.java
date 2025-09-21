package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.*;
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

    //新增语句
    @Insert("insert into dept(name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
    void add(Dept dept);

    //查询回显
    @Select("select id,name,create_time,update_time from dept where id = #{id}")
    Dept getById(Integer id);

    //修改数据
    @Update("update  dept set name = #{name},update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);
}
