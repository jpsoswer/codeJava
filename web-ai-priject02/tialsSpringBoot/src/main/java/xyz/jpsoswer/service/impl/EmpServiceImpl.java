package xyz.jpsoswer.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.jpsoswer.mapper.EmpMapper;
import xyz.jpsoswer.pojo.Emp;
import xyz.jpsoswer.pojo.PageResult;
import xyz.jpsoswer.service.EmpService;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    //接收分页查询数据
    @Override
    public PageResult<Emp> page(Integer page,Integer pageSize)
    {
        //1.设置分页参数(PageHelper)
        PageHelper.startPage(page,pageSize);

        //2.执行查询
        List<Emp> empList = empMapper.list();

        //3.解析查询结果，并封装
        Page<Emp> p = (Page<Emp>) empList;
        return new PageResult<Emp>(p.getTotal(),p.getResult()) ;
    }

    //PageResult<Emp>(p.getTotal(),p.getResult())
}
