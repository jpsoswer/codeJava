package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.*;
import xyz.jpsoswer.pojo.Student;
import xyz.jpsoswer.pojo.StudentsQueryParam;

import java.util.List;

@Mapper
public interface StudentsMapper {
    //查询学员
    List<Student> findAll(StudentsQueryParam studentsQueryParam);

    //删除学员
    void delete(@Param("ids") List<Integer> ids);

    //添加学员
    @Insert("insert into student(name, no, gender, phone, id_card, is_college, address, degree, graduation_date,clazz_id,update_time)" +
            "values (#{name},#{no},#{gender},#{phone},#{idCard}," +
            "#{isCollege},#{address},#{degree},#{graduationDate},#{clazzId},#{updateTime})")
    void add(Student student);

    //回显数据
    @Select("select id, name, no, gender, phone, id_card, is_college, address, degree, graduation_date, clazz_id, violation_count, violation_score, create_time, update_time" +
            " from student where id = #{id}")
    Student studentFind(Integer id);

    //修改学生信息
    void update(Student student);

    //违规次数
    void updateViolation(@Param("id") Integer id, @Param("newViolationCount") Integer newViolationCount, @Param("newViolationScore") Integer newViolationScore);

    //是设置违规信息接口

}
