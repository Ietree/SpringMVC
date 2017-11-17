package com.ietree.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MyController
{
    @RequestMapping("/myAjax.do")
    public void doAjax(String name, int age)
    {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
