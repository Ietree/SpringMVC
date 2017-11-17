package com.ietree.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ietree.springmvc.beans.Student;
import com.ietree.springmvc.service.IStudentService;

@Controller
@RequestMapping("/test")
public class StudentController
{
    @Autowired
    @Qualifier("studentService")
    private IStudentService service;

    @RequestMapping("/register.do")
    public String doRegister(String name, int age) throws Exception
    {
        Student student = new Student(name, age);

        service.addStudent(student);

        return "/welcome.jsp";
    }
}
