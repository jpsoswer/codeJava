package xyz.jpsoswer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.jpsoswer.pojo.Emp;
import xyz.jpsoswer.pojo.EmpQueryParam;
import xyz.jpsoswer.pojo.PageResult;
import xyz.jpsoswer.pojo.Result;
import xyz.jpsoswer.service.EmpService;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpContrpller {
    @Autowired
    private EmpService empService;
    //分页查询
//    @GetMapping
//    public Result page(@RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10") Integer pageSize,
//                       String name, Integer gender,
//                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
//                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
//        log.info("分页查询：{},{},{},{},{},{}",page,pageSize,name,gender,begin,end);
//        PageResult<Emp> pageResult = empService.page(page,pageSize,name,gender,begin,end);
//        return Result.success(pageResult);
//    }

    //分页查询2

    @GetMapping
    public Result page(EmpQueryParam empQueryParam){
        log.info("分页查询：{}",empQueryParam);
        PageResult<Emp> pageResult = empService.page(empQueryParam);
        return Result.success(pageResult);
    }
}
