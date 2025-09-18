package xyz.jpsoswer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HtttpController {

    @RequestMapping("/target")
    public String resut(HttpServletRequest result)
    {
        //获取请求方式
        String method = result.getMethod();
        System.out.println("请求方式："+method);

        //获取url地址
        String string = result.getRequestURL().toString();
        System.out.println("url地址："+string);
        //获取uri地址
        String requestURI = result.getRequestURI();
        System.out.println("uri地址："+requestURI);

        //获取请求协议
        String protocol = result.getProtocol();
        System.out.println("请求协议："+protocol);
        //获取请求参数
        String name = result.getParameter("name");
        System.out.println("请求参数："+name);
        //获取请求头
        String accept = result.getHeader("Accept");
        System.out.println("请求头："+accept);
        return "OK";
    }

    @RequestMapping("/response")
    public ResponseEntity<String> responseEntity()
    {
        return ResponseEntity.status(401)
                .header("group","itheima")
                .body("<h1>hello response</h1>");
    }
}
