package xyz.jpsoswer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.jpsoswer.pojo.Dept;
import xyz.jpsoswer.pojo.Result;
import xyz.jpsoswer.service.DeptService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class DeptContrpller {
    @Autowired
    private DeptService deptService;


    //@RequestMapping(value = "/depts" , method = RequestMethod.GET)
    //查询部门信息
    @GetMapping("/depts")
    public Result list()
    {
        System.out.println("查询全部部门数据");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }
    //删除部门
//    @DeleteMapping("/depts")
//    public Result delete(HttpServletRequest request)
//    {
//        String idStr = request.getParameter("id");
//        int id = Integer.parseInt(idStr);
//        System.out.println("根据ID删除部门：" +id);
//        return Result.success();
//    }

    //删除部门2
    @DeleteMapping("/depts")
    public Result delete(Integer id)
    {
        System.out.println("根据ID删除部门：" +id);
        deptService.deleteById(id);
        return Result.success();
    }

    //删除部门3
//    @DeleteMapping("/depts")
//    public Result delete(@RequestParam(value = "id") Integer idpm)
//    {
//        System.out.println("根据ID删除部门：" +idpm);
//        return Result.success();
//    }


}
