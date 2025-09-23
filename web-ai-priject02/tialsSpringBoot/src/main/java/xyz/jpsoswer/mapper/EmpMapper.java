package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xyz.jpsoswer.pojo.Emp;

import java.util.List;

@Mapper
public interface EmpMapper {

    //分页查询
    @Select("select e.*,d.name deptName from emp e left join dept d on e.dept_id = d.id order by e.update_time desc ")
    public List<Emp> list();
}
