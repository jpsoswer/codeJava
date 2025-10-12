package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.*;
import xyz.jpsoswer.pojo.Emp;
import xyz.jpsoswer.pojo.EmpQueryParam;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    //分页查询
//    @Select("select e.*,d.name deptName from emp e left join dept d on e.dept_id = d.id order by e.update_time desc ")
//    public List<Emp> list(@Param("name") String name,@Param("gender") Integer gender,@Param("begin") LocalDate begin,
//                          @Param("end") LocalDate end);

    //分页查询2
    public List<Emp> list(EmpQueryParam empQueryParam);

    @Options(useGeneratedKeys = true,keyProperty = "id") //获取到生成的主键 -- 主键返回
    @Insert("insert into emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time)  " +
            "values (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime})")
    void insert(Emp emp);

    //删除员工信息
    void deleteByIds(@Param("ids") List<Integer> ids);

    Emp getInfo(Integer id);

    void updateById(Emp emp);
}
