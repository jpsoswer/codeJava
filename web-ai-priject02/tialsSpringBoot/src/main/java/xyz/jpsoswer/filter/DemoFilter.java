package xyz.jpsoswer.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(urlPatterns = "/*")
@Slf4j
public class DemoFilter implements Filter {
    //初始化服务，只在初始化Web服务器时执行
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init 初始化方法 ....");
    }

    //拦截请求之后执行，会执行多次
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("拦截到了方法 ....");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

    //销毁操作，只在关闭Web服务器时执行
    @Override
    public void destroy() {
        log.info("destroy 销毁方法 ....");
    }
}
