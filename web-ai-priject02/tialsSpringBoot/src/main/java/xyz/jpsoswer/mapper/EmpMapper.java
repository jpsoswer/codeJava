package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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

}
