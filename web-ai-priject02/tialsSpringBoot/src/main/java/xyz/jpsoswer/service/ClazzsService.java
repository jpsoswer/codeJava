package xyz.jpsoswer.service;

import xyz.jpsoswer.pojo.Clazz;
import xyz.jpsoswer.pojo.ClazzsQueryParam;
import xyz.jpsoswer.pojo.ClazzsResult;

public interface ClazzsService {
    //查询班级数据
    ClazzsResult<Clazz> findAll(ClazzsQueryParam clazzsQueryParam);

    
}
