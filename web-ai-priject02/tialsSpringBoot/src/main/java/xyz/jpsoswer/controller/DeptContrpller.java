package xyz.jpsoswer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.jpsoswer.anno.Log;
import xyz.jpsoswer.pojo.Dept;
import xyz.jpsoswer.pojo.Result;
import xyz.jpsoswer.service.DeptService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/depts")
@RestController
public class DeptContrpller {
    @Autowired
    private DeptService deptService;


    //@RequestMapping(value = "/depts" , method = RequestMethod.GET)
    //查询部门信息
    @GetMapping
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
    @Log
    @DeleteMapping
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

    /*
    新增部门
     */
    @Log
    @PostMapping
    public Result add(@RequestBody Dept dept)
    {
        System.out.println("新增部门："+ dept);
        deptService.add(dept);
        return Result.success();
    }

    /*
    根据id查询部门
     */
//    @GetMapping("/depts/{id}")
//    public Result getInfo(@PathVariable("id") Integer deptId)
//    {
//        System.out.println("根据ID查询部门："+deptId);
//        return Result.success();
//    }

    /*
    根据id查询部门2
     */
    @GetMapping("/{id}")
    public Result getInfo(@PathVariable Integer id)
    {
        System.out.println("根据ID查询部门："+id);
        Dept dept = deptService.geById(id);
        return Result.success(dept);
    }

    /*
    修改数据
     */
    @Log
    @PutMapping
    public Result update(@RequestBody Dept dept)
    {
        System.out.println("修改部门："+dept);
        deptService.update(dept);
        return Result.success();
    }

}
