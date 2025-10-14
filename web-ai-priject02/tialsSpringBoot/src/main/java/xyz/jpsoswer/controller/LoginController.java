package xyz.jpsoswer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.jpsoswer.pojo.Emp;
import xyz.jpsoswer.pojo.LoginInfo;
import xyz.jpsoswer.pojo.Result;
import xyz.jpsoswer.service.EmpService;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    private EmpService empService;
    //登录功能
    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("登录：{}",emp);
        LoginInfo loginInfo = empService.login(emp);
        if(loginInfo != null)
        {
            return Result.success(loginInfo);
        }
        return Result.error("用户名或密码错误，请重新输入");
    }
}
