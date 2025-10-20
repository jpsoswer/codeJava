package xyz.jpsoswer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xyz.jpsoswer.pojo.Clazz;
import xyz.jpsoswer.pojo.ClazzsQueryParam;

import java.util.List;

@Mapper
public interface ClazzsMapper {
    List<Clazz> list(ClazzsQueryParam clazzsQueryParam);

    //查询班级信息

}
