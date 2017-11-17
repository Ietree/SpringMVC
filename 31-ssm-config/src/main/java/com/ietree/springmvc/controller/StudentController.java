package com.ietree.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ietree.springmvc.beans.Student;
import com.ietree.springmvc.service.IStudentService;

public class StudentController implements Controller
{
    private IStudentService service;

    public void setService(IStudentService service)
    {
        this.service = service;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        Integer age = Integer.valueOf(ageStr);
        Student student = new Student(name, age);

        service.addStudent(student);

        return new ModelAndView("/welcome.jsp");
    }
}
