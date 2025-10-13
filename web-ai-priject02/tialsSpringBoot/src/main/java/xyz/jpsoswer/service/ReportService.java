package xyz.jpsoswer.service;

import xyz.jpsoswer.pojo.JobOption;

public interface ReportService {

    //统计员工职位人数
    JobOption getEmpJobData();
}
