package com.ietree.springmvc.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/springmvc") // 命名空间
public class MyController
{
    // @RequestMapping("/my.do")
    // @RequestMapping({"/my.do", "hello.do"})
    @RequestMapping(value = { "/my.do", "hello.do" }, method = RequestMethod.POST)
    public ModelAndView doSome(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行doFirst方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    // @RequestMapping(value = "/second.do", params = { "name", "!age" })
    @RequestMapping(value = "/second.do", params = { "name=z3", "age=23" })
    public ModelAndView doSecond(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行second方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/*third.do")
    public ModelAndView doThird(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行third方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/fourth*.do")
    public ModelAndView doFourth(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行fourth方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/*/fifth.do")
    public ModelAndView doFifth(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行fifth方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/**/sixth.do")
    public ModelAndView doSixth(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行sixth方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }
}
