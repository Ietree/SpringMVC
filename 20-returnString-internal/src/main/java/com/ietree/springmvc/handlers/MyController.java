package com.ietree.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test") // 命名空间
public class MyController
{
    @RequestMapping("/some.do")
    public String doSome()
    {
        return "welcome";
    }
}
