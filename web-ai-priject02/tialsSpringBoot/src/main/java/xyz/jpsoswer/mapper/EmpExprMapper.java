package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.jpsoswer.pojo.EmpExpr;

import java.util.List;

//员工工作经历操作接口
@Mapper
public interface EmpExprMapper {
    void insertBatch(@Param("exprList") List<EmpExpr> exprList);

    //批量删除员工工作经历信息
    void deleteByEmpIds(@Param("empIds") List<Integer> empIds);
}
