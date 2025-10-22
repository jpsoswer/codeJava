package xyz.jpsoswer.service;

import xyz.jpsoswer.pojo.Log;
import xyz.jpsoswer.pojo.LogQueryParam;
import xyz.jpsoswer.pojo.PageResult;

public interface LogService {
    //查询日志
    PageResult<Log> findLog(LogQueryParam logQueryParam);
}
