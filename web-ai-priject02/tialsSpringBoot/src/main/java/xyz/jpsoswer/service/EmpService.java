package xyz.jpsoswer.service;

import org.springframework.format.annotation.DateTimeFormat;
import xyz.jpsoswer.pojo.Emp;
import xyz.jpsoswer.pojo.EmpQueryParam;
import xyz.jpsoswer.pojo.PageResult;

import java.time.LocalDate;

public interface EmpService {

//    //分页查询 page:页码    pageSize:记录数
//    PageResult<Emp> page(Integer page, Integer pageSize,String name, Integer gender,LocalDate begin, LocalDate end);

    //分页查询2
    PageResult<Emp> page(EmpQueryParam empQueryParam);
}
