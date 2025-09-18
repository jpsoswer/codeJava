package xyz.jpsoswer.colntorller;

import cn.hutool.core.io.IoUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.jpsoswer.demos.userBDemo;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserColntorller {
    @RequestMapping("/list")
    public List<userBDemo> list()
    {
        //从文件中获取数据
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());

        //将获取到的数据转换为对象返回
        List<userBDemo> userlist = lines.stream().map(line -> {
            String[] split = line.split(",");
            Integer id = Integer.parseInt(split[0]);
            String username = split[1];
            String password = split[2];
            String name = split[3];
            Integer age = Integer.parseInt(split[4]);
            LocalDateTime updatetime = LocalDateTime.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
            return new userBDemo(id, username, password, name, age, updatetime);
        }).collect(Collectors.toList());

        return userlist;
    }
}
