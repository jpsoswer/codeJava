package xyz.jpsoswer.mappar;

import org.apache.ibatis.annotations.*;
import xyz.jpsoswer.pojo.User;

import java.util.List;

@Mapper
public interface UserMappar {
    //@Select("select * from user")
    public List<User> findAll();

    @Delete("delete from user where id = #{id}")
    public void deleteGid(Integer id);

    @Insert("insert into user(username,password,name,age) values(#{username},#{password},#{name},#{age})")
    public void insertShu(User user);

    @Update("update user set username = #{username},password=#{password},name=#{name},age=#{age} where id = #{id}")
    public void updateShu(User user);

    @Select("select * from user where username = #{username} and password = #{password} ")
    public User selectUser(@Param("username")String username,@Param("password")String password);
}
