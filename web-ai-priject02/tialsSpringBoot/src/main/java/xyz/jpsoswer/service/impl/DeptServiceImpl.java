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
    public List<Dept> findAll() {
        return deptmapper.findAll();
    }
}
