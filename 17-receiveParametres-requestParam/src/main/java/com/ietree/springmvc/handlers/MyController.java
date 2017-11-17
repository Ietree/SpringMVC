package com.ietree.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MyController
{
    @RequestMapping("/register.do")
    public ModelAndView doRegister(@RequestParam("pname") String name, int age)//@RequestParam 校正请求参数
    {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }
}
