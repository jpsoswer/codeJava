package xyz.jpsoswer.filter;

import lombok.extern.slf4j.Slf4j;
import xyz.jpsoswer.utils.JwtUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
@Slf4j
public class TokenFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //1.获取请求路径
        String requestURI = request.getRequestURI();//获取后面的路径   /employee/login
        //2.判断是否是登陆请求，如果路径中包含/login,说明是登陆操作，放行
        if(requestURI.contains("/login")){
            log.info("登录请求，放行");
            filterChain.doFilter(request,response);
            //代码结束
            return;
        }
        //3.获取请求头中的Token
        String token = request.getHeader("token");
        //4.判断token是否存在，如果不存在说明用户没有登陆，返回错误信息(响应401状态码)
        if(token == null || token.isEmpty()){
            log.info("令牌为空，响应401");
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            //代码结束
            return;
        }
        //5.如果token存在，校验令牌，如果校验失败->返回错误信息(响应401状态码)
        try {
            JwtUtils.parseJWT(token);
        } catch (Exception e) {
            log.info("令牌非法，响应401");
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            //代码结束
            return;
        }
        //6.校验通过，放行
        filterChain.doFilter(request,response);
    }
}
