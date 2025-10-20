package xyz.jpsoswer.service;

import xyz.jpsoswer.pojo.Clazz;
import xyz.jpsoswer.pojo.ClazzsQueryParam;
import xyz.jpsoswer.pojo.ClazzsResult;

public interface ClazzsService {
    //查询班级数据
    ClazzsResult<Clazz> findAll(ClazzsQueryParam clazzsQueryParam);

    //删除班级数据
    void delete(Integer id);

    //添加班级信息
    void add(Clazz clazz);


    //查询回显班级信息
    Clazz getInfo(Integer id);

    //修改班级信息
    void update(Clazz clazz);
}
