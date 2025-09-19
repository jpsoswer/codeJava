package xyz.jpsoswer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.jpsoswer.mapper.deptMapper;
import xyz.jpsoswer.pojo.Dept;
import xyz.jpsoswer.service.DeptService;

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
}
