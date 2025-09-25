package xyz.jpsoswer.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.jpsoswer.mapper.EmpExprMapper;
import xyz.jpsoswer.mapper.EmpMapper;
import xyz.jpsoswer.pojo.Emp;
import xyz.jpsoswer.pojo.EmpExpr;
import xyz.jpsoswer.pojo.EmpQueryParam;
import xyz.jpsoswer.pojo.PageResult;
import xyz.jpsoswer.service.EmpService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpExprMapper empExprMapper;

    //接收分页查询数据
//    @Override
//    public PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end)
//    {
//        //1.设置分页参数(PageHelper)
//        PageHelper.startPage(page,pageSize);
//
//        //2.执行查询
//        List<Emp> empList = empMapper.list(name,gender,begin,end);
//
//        //3.解析查询结果，并封装
//        Page<Emp> p = (Page<Emp>) empList;
//        return new PageResult<Emp>(p.getTotal(),p.getResult()) ;
//    }

    //PageResult<Emp>(p.getTotal(),p.getResult())

    //接收分页查询数据2
    @Override
    public PageResult<Emp> page(EmpQueryParam empQueryParam)
    {
        //1.设置分页参数(PageHelper)
        PageHelper.startPage(empQueryParam.getPage(),empQueryParam.getPageSize());

        //2.执行查询
        List<Emp> empList = empMapper.list(empQueryParam);

        //3.解析查询结果，并封装
        Page<Emp> p = (Page<Emp>) empList;
        return new PageResult<Emp>(p.getTotal(),p.getResult()) ;
    }

    //新增员工信息
    @Override
    public void save(Emp emp) {
        //1.添加员工信息
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);
        //2.处理员工工作经历信息
        List<EmpExpr> exprList = emp.getExprList();
        if(!CollectionUtils.isEmpty(exprList))
        {
            //遍历集合，为empId赋值
            exprList.forEach(empExpr -> {
                empExpr.setEmpId(emp.getId());
            });
            empExprMapper.insertBatch(exprList);
        }
    }
}
