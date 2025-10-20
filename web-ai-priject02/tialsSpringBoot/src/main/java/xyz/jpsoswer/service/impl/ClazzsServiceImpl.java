package xyz.jpsoswer.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.jpsoswer.mapper.ClazzsMapper;
import xyz.jpsoswer.pojo.Clazz;
import xyz.jpsoswer.pojo.ClazzsQueryParam;
import xyz.jpsoswer.pojo.ClazzsResult;
import xyz.jpsoswer.service.ClazzsService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClazzsServiceImpl implements ClazzsService {

    @Autowired
    private ClazzsMapper clazzsMapper;

    @Override
    public ClazzsResult<Clazz> findAll(ClazzsQueryParam clazzsQueryParam) {
        //1.设置分页参数(PageHelper)
        PageHelper.startPage(clazzsQueryParam.getPage(),clazzsQueryParam.getPageSize());
        //2.执行查询
        List<Clazz> clazzList = clazzsMapper.list(clazzsQueryParam);
        //3.解析结果，并封装
        Page<Clazz> p = (Page<Clazz>) clazzList;
        return new ClazzsResult<Clazz>(p.getTotal(),p.getResult());
    }

    //删除班级数据
    @Override
    public void delete(Integer id) {
        clazzsMapper.delete(id);
    }

    //添加班级信息

    @Override
    public void add(Clazz clazz) {
        //添加员工信息
        clazz.setCreateTime(LocalDateTime.now());
        clazz.setUpdateTime(LocalDateTime.now());
        clazzsMapper.add(clazz);
    }

    @Override
    public Clazz getInfo(Integer id) {
        return clazzsMapper.getInfo(id);
    }

    @Override
    public void update(Clazz clazz) {
        //修改更新时间
        clazz.setUpdateTime(LocalDateTime.now());
        //调用接口更新数据
        clazzsMapper.update(clazz);
    }
}
