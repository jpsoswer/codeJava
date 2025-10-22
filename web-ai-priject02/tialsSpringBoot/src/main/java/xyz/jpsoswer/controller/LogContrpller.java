package xyz.jpsoswer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.jpsoswer.pojo.Log;
import xyz.jpsoswer.pojo.LogQueryParam;
import xyz.jpsoswer.pojo.PageResult;
import xyz.jpsoswer.pojo.Result;
import xyz.jpsoswer.service.LogService;

@RequestMapping
@RestController
@Slf4j
public class LogContrpller {
    @Autowired
    private LogService logService;

    @GetMapping("/log/page")
    public Result findLog(LogQueryParam logQueryParam){
        log.info("查询日志:{}",logQueryParam);
        PageResult<Log> pageResult = logService.findLog(logQueryParam);
        return Result.success(pageResult);
    }
}
