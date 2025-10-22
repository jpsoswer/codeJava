package xyz.jpsoswer.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.jpsoswer.mapper.StudentsMapper;
import xyz.jpsoswer.pojo.Student;
import xyz.jpsoswer.pojo.StudentsQueryParam;
import xyz.jpsoswer.pojo.StudentsResult;
import xyz.jpsoswer.service.StudentsService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsMapper studentsMapper;

    //查找学员数据
    @Override
    public StudentsResult<Student> findAll(StudentsQueryParam studentsQueryParam) {
        //1.设置分页参数(PageHelper)
        PageHelper.startPage(studentsQueryParam.getPage(),studentsQueryParam.getPageSize());
        //2.执行查询
        List<Student> studentList = studentsMapper.findAll(studentsQueryParam);
        //3.解析结果并封装
        Page<Student> p = (Page<Student>) studentList;
        return new StudentsResult<Student>(p.getTotal(),p.getResult());
    }

    @Override
    public void delete(List<Integer> ids) {
        studentsMapper.delete(ids);
    }

    //添加学员信息
    @Override
    public void add(Student student) {
        student.setCreateTime(LocalDateTime.now());
        student.setUpdateTime(LocalDateTime.now());
        studentsMapper.add(student);
    }

    @Override
    public Student studentFind(Integer id) {
        return studentsMapper.studentFind(id);
    }

    @Override
    public void update(Student student) {
        //先将updateTime设置为当前系统时间
        student.setUpdateTime(LocalDateTime.now());

        //将student传递下去
        studentsMapper.update(student);
    }

    //设置违规分数
    @Override
    public void updateViolation(Integer id, Integer score) {
        // 参数验证
        if (id == null) {
            throw new IllegalArgumentException("学生ID不能为空");
        }
        if (score == null || score <= 0) {
            throw new IllegalArgumentException("扣分分数必须为正整数");
        }

        // 检查学生是否存在
        Student existingStudent = studentsMapper.studentFind(id);
        if (existingStudent == null) {
            throw new RuntimeException("学生不存在，ID: " + id);
        }

        Student student = new Student();
        // 计算新的违规次数和分数
        Short currentViolationCount = student.getViolationCount() != null ?
                existingStudent.getViolationCount() : 0;
        Short currentViolationScore = student.getViolationScore() != null ?
                existingStudent.getViolationScore() : 0;

        Integer newViolationCount = currentViolationCount + 1;
        Integer newViolationScore = currentViolationScore + score;

        // 更新违规信息
        studentsMapper.updateViolation(id, newViolationCount, newViolationScore);
    }
}
