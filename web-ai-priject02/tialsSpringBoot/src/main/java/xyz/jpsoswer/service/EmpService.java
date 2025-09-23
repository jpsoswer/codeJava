package xyz.jpsoswer.service;

import xyz.jpsoswer.pojo.Emp;
import xyz.jpsoswer.pojo.PageResult;

public interface EmpService {
    //分页查询 page:页码    pageSize:记录数
    PageResult<Emp> page(Integer page, Integer pageSize);
}
