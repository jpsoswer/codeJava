package xyz.jpsoswer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.jpsoswer.mapper.UserMapper;

@SpringBootApplication
public class MybatisFirstDemo1Application {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01()
    {
        userMapper.findAll().forEach(
                System.out::println
        );
    }
}
