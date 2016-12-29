package com.mouse.moon.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * Created by wuhao1 on 2016/7/20.
 */
public class FrameworkFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse)servletResponse;
        doDispatcher(httpRequest,httpResponse);//execute doDispatcher
    }

    public void doDispatcher(HttpServletRequest httpRequest,HttpServletResponse httpResponse){
        System.out.println("父类");
    }

    public void destroy() {
        System.out.println("destory");
    }
}
