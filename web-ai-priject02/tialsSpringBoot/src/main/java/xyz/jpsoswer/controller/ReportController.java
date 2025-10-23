package xyz.jpsoswer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.jpsoswer.pojo.ClazzCountOption;
import xyz.jpsoswer.pojo.JobOption;
import xyz.jpsoswer.pojo.Result;
import xyz.jpsoswer.service.ReportService;

import java.util.List;
import java.util.Map;

@Slf4j
@RequestMapping("/report")
@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

    //统计员工人数
    @GetMapping("/empJobData")
    public Result getEmpJobData()
    {
        log.info("统计员工人数");
        JobOption jobOption = reportService.getEmpJobData();
        return Result.success(jobOption);
    }

    //统计员工性别人数
    @GetMapping("/empGenderData")
    public Result getEmpGenderData(){
        log.info("统计员工性别人数");
        List<Map<String,Object>> genderList = reportService.getEmpGenderData();
        return Result.success(genderList);
    }

    //统计学历人数信息
    @GetMapping("/studentDegreeData")
    public Result getStudentCount(){
        log.info("统计各学历的人数");
        List<Map<String,Object>> studentCountList = reportService.getStudentCount();
        return Result.success(studentCountList);
    }

    //班级人数统计
    @GetMapping("/studentCountData")
    public Result getStudentData(){
        log.info("统计班级人数");
        ClazzCountOption clazzCountOption = reportService.getStudentData();
        return Result.success(clazzCountOption);
    }
}
