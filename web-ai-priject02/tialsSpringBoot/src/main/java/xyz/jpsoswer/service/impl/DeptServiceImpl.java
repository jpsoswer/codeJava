package xyz.jpsoswer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.jpsoswer.mapper.deptMapper;
import xyz.jpsoswer.pojo.Dept;
import xyz.jpsoswer.service.DeptService;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private deptMapper deptmapper;

    @Override
    public void deleteById(Integer id) {
        deptmapper.deleteById(id);
    }

    //调用查询部门信息的接口
    @Override
    public List<Dept> findAll() {
        return deptmapper.findAll();
    }

    @Override
    public void add(Dept dept) {
        //1.处理数据(将创建时间和修改时间更新复制)
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        //2.调用Mapper接口
        deptmapper.add(dept);
    }

    //查询回显数据
    @Override
    public Dept geById(Integer id) {
        return deptmapper.getById(id);
    }

    @Override
    public void update(Dept dept) {
        //处理数据
        dept.setUpdateTime(LocalDateTime.now());
        //调用Mapper接口
        deptmapper.update(dept);
    }
}
