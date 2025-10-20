package xyz.jpsoswer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.jpsoswer.pojo.Clazz;
import xyz.jpsoswer.pojo.ClazzsQueryParam;
import xyz.jpsoswer.pojo.ClazzsResult;
import xyz.jpsoswer.pojo.Result;
import xyz.jpsoswer.service.ClazzsService;


@RequestMapping("/clazzs")
@RestController
@Slf4j
public class ClazzsContrpller {
    @Autowired
    private ClazzsService clazzsService;

    //查询班级列表
    @GetMapping
    public Result clazzsPage(ClazzsQueryParam clazzsQueryParam)
    {
        log.info("查询全部班级数据: {}",clazzsQueryParam);
        ClazzsResult<Clazz> clazzList = clazzsService.findAll(clazzsQueryParam);
        return Result.success(clazzList);
    }

    //删除班级信息
    @DeleteMapping("/{id}")
    public Result deleteClazzs(@PathVariable Integer id){
        log.info("删除id为{}的数据",id);
        clazzsService.delete(id);
        return Result.success();
    }

    //添加班级信息
    @PostMapping
    public Result addClazzs(@RequestBody Clazz clazz){
        log.info("新增班级:{}",clazz);
        clazzsService.add(clazz);
        return Result.success();
    }

    //查询回显班级信息
    @GetMapping("/{id}")
    public Result getInto(@PathVariable Integer id){
        log.info("根据ID查询班级信息:",id);
        Clazz clazz = clazzsService.getInfo(id);
        return Result.success(clazz);
    }

    //修改班级信息
    @PutMapping
    public Result update(@RequestBody Clazz clazz){
        log.info("修改班级信息:{}",clazz);
        clazzsService.update(clazz);
        return Result.success();
    }
}
