package com.ietree.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MyController
{
    @RequestMapping("/register.do")
    public ModelAndView doRegister(String name, int age)
    {
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        ModelAndView mv = new ModelAndView();
        mv.addObject("pname", name);
        mv.addObject("page", age);
        mv.setViewName("redirect:welcome.jsp");
        return mv;
    }

    @RequestMapping("/some.do")
    public String doSome(String name, int age, Model model)
    {
        model.addAttribute("pname", name);
        model.addAttribute("page", age);
        return "redirect:other.do";
    }

    @RequestMapping("/other.do")
    public String doOther()
    {
        return "/welcome.jsp";
    }
}
