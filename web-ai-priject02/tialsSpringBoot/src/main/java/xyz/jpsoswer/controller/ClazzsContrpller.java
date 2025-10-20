package xyz.jpsoswer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.jpsoswer.pojo.Clazz;
import xyz.jpsoswer.pojo.ClazzsQueryParam;
import xyz.jpsoswer.pojo.ClazzsResult;
import xyz.jpsoswer.pojo.Result;
import xyz.jpsoswer.service.ClazzsService;

import java.util.List;

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
}
