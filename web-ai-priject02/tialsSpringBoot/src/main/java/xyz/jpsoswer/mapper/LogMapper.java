package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xyz.jpsoswer.pojo.Log;
import xyz.jpsoswer.pojo.LogQueryParam;

import java.util.List;

@Mapper
public interface LogMapper {
    //执行查询日志接口
    @Select("select * from operate_log")
    List<Log> findLog(LogQueryParam logQueryParam);
}
