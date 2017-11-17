package com.ietree.springmvc.handlers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MyController
{
    @RequestMapping("/register.do")
    public ModelAndView doRegister(int age, Date birthday)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("age", age);
        mv.addObject("birthday", birthday);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    // 转型异常之后跳转到指定页面，数据回显
    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView exceptionResolver(HttpServletRequest request, Exception ex)
    {
        String age = request.getParameter("age");
        String birthday = request.getParameter("birthday");
        ModelAndView mv = new ModelAndView();
        mv.addObject(age);
        mv.addObject(birthday);
        mv.setViewName("/index.jsp");
        return mv;
    }
}
