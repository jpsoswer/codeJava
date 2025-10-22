package xyz.jpsoswer.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.jpsoswer.mapper.LogMapper;
import xyz.jpsoswer.pojo.Log;
import xyz.jpsoswer.pojo.LogQueryParam;
import xyz.jpsoswer.pojo.PageResult;
import xyz.jpsoswer.service.LogService;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;

    @Override
    public PageResult<Log> findLog(LogQueryParam logQueryParam) {
        //1.设置分页参数
        PageHelper.startPage(logQueryParam.getPage(),logQueryParam.getPageSize());

        //2.执行查询
        List<Log> logList = logMapper.findLog(logQueryParam);

        //3.解析查询结果并封装
        Page<Log> p = (Page<Log>) logList;
        return new PageResult<Log>(p.getTotal(),p.getResult());
    }
}
