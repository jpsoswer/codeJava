package xyz.jpsoswer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.jpsoswer.mapper.EmpMapper;
import xyz.jpsoswer.pojo.ClazzCountOption;
import xyz.jpsoswer.pojo.JobOption;
import xyz.jpsoswer.service.ReportService;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private EmpMapper empMapper;


    @Override
    public JobOption getEmpJobData() {
        //调用mapper接口，获取统计数据
        List<Map<String, Object>> list = empMapper.countEmpJobData();
        //组装结果并返回
        List<Object> jobList = list.stream().map(dataMap -> dataMap.get("pos")).collect(Collectors.toList());
        List<Object> dataList = list.stream().map(dataMap -> dataMap.get("num")).collect(Collectors.toList());
        return new JobOption(jobList,dataList);
    }

    //统计班级人数
    @Override
    public ClazzCountOption getStudentData() {
        //调用mapper接口，获取统计数据
        List<Map<String,Object>> list = empMapper.getStudentData();
        //组装结果并返回
        List<Object> clazzList = list.stream().map(dataMap -> dataMap.get("name")).collect(Collectors.toList());
        List<Object> dataList = list.stream().map(dataMap -> dataMap.get("value")).collect(Collectors.toList());
        return new ClazzCountOption(clazzList,dataList);
    }

    @Override
    public List<Map<String, Object>> getEmpGenderData() {
        return empMapper.countEmpGenderData();
    }

    //统计学历人数信息
    @Override
    public List<Map<String, Object>> getStudentCount() {
        return empMapper.getStudentCount();
    }

}
