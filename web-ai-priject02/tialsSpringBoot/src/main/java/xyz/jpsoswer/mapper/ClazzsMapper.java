package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.*;
import xyz.jpsoswer.pojo.Clazz;
import xyz.jpsoswer.pojo.ClazzsQueryParam;

import java.util.List;

@Mapper
public interface ClazzsMapper {
    //查询班级信息
    List<Clazz> list(ClazzsQueryParam clazzsQueryParam);

    //删除班级表数据
    @Delete("delete from clazz where id = #{id}")
    void delete(Integer id);


    //新建班级信息
    @Insert("insert into clazz(name,room,begin_date,end_date,master_id,subject,update_time) " +
            "values (#{name},#{room},#{beginDate},#{endDate},#{masterId},#{subject},#{updateTime})")
    void add(Clazz clazz);

    //查询回显数据
    @Select("select id,name,room,begin_date,end_date,master_id,subject,create_time,update_time" +
            " from clazz where id = #{id}")
    Clazz getInfo(@Param("id") Integer id);


    void update(Clazz clazz);
}
