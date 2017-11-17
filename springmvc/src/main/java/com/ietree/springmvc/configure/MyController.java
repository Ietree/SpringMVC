package com.ietree.springmvc.configure;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller
{
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        // 其底层执行的是request.setAttribute()方法
        mv.addObject("message", "Hello SpringMVC World!");
        // 使用视图解析器简化视图路径
        // mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        mv.setViewName("welcome");
        return mv;
    }
}
