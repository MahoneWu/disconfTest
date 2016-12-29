package com.mouse.moon.filter;

import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wuhao1 on 2016/7/20.
 */
public class DealFilter extends FrameworkFilter {

    public void doDispatcher(HttpServletRequest httpRequest, HttpServletResponse httpResponse){
        System.out.println("子类");
    }
}
