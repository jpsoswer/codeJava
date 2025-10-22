package xyz.jpsoswer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.jpsoswer.pojo.Result;
import xyz.jpsoswer.pojo.Student;
import xyz.jpsoswer.pojo.StudentsQueryParam;
import xyz.jpsoswer.pojo.StudentsResult;
import xyz.jpsoswer.service.StudentsService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/students")
public class StudentsContrpller {
    @Autowired
    private StudentsService studentsService;

    //查询学员信息
    @GetMapping
    public Result StudentsPage(StudentsQueryParam studentsQueryParam){
        log.info("查询全部学员信息：{}",studentsQueryParam);
        StudentsResult<Student> studentsList = studentsService.findAll(studentsQueryParam);
        return Result.success(studentsList);
    }

    //删除学员信息
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        log.info("需要删除学员的ID为:{}",ids);
        studentsService.delete(ids);
        return Result.success();
    }

    //添加学员信息
    @PostMapping
    public Result add(@RequestBody Student student){
        log.info("新增学员:{}",student);
        studentsService.add(student);
        return Result.success();
    }

    //查询回显学员信息
    @GetMapping("/{id}")
    public Result studentFind(@PathVariable Integer id){
        log.info("根据id查询员工信息:",id);
        Student student = studentsService.studentFind(id);
        return Result.success(student);
    }

    //修改员工信息
    @PutMapping
    public Result update(@RequestBody Student student){
        log.info("修改数据:{}",student);
        studentsService.update(student);
        return Result.success();
    }

    //违规扣分
    @PutMapping("/violation/{id}/{score}")
    public Result updateViolation(@PathVariable Integer id,@PathVariable Integer score){
        log.info("违规的学生为:{},扣除{}分",id,score);
        studentsService.updateViolation(id,score);
        return Result.success();
    }
}
