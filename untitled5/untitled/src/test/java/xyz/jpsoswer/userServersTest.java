package xyz.jpsoswer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
@DisplayName("用户信息测试类")
public class userServersTest {
    @Test
    public void test01()
    {
        new userServers("鸡哥","男",28).sing();
    }
    @Test
    public void test02()
    {
        userServers us = new userServers("鸡哥","男",28);
        String name = us.getName();
        //断言
        Assertions.assertEquals("鸡哥",name,"出错了，出错了！");
    }
    //参数化测试
    @DisplayName("用户姓名测试")
    @ParameterizedTest
    @ValueSource(strings = {"鸡哥","鸡哥","鸡哥"})
    public void test03(String idcord)
    {
        userServers us = new userServers("鸡哥","男",28);
        String name = us.getName();
        //断言
        Assertions.assertEquals(idcord,name,"出错了，出错了！");
    }
}
