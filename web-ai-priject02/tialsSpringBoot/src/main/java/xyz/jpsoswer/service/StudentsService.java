package xyz.jpsoswer.service;

import xyz.jpsoswer.pojo.Student;
import xyz.jpsoswer.pojo.StudentsQueryParam;
import xyz.jpsoswer.pojo.StudentsResult;

import java.util.List;

public interface StudentsService {
    //查找学员数据
    StudentsResult<Student> findAll(StudentsQueryParam studentsQueryParam);

    //删除学员数据
    void delete(List<Integer> ids);

    //新增学员
    void add(Student student);

    //回显数据
    Student studentFind(Integer id);

    //修改数据
    void update(Student student);

    //设置违规分数
    void updateViolation(Integer id, Integer score);
}
