package com.ietree.springmvc.annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController
{
    @RequestMapping("/my.html")
    public ModelAndView doSome(HttpServletRequest request, HttpServletResponse response)
    {
        ModelAndView mv = new ModelAndView();
        // 其底层执行的是request.setAttribute()方法
        mv.addObject("message", "Hello SpringMVC World!");
        // 使用视图解析器简化视图路径
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        // mv.setViewName("welcome");
        return mv;
    }
}
