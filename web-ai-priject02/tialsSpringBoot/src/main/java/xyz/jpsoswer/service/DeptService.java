package xyz.jpsoswer.service;


import xyz.jpsoswer.pojo.Dept;

import java.util.List;

public interface DeptService {
    //根据id删除数据
    void deleteById(Integer id) ;

    List<Dept> findAll();

    void add(Dept dept);

    Dept geById(Integer id);

    void update(Dept dept);
}
