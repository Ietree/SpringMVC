package com.ietree.springmvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ietree.springmvc.beans.Student;
import com.ietree.springmvc.dao.IStudentDao;
import com.ietree.springmvc.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService
{
    @Resource(name = "IStudentDao")
    private IStudentDao dao;

    @Transactional
    public void addStudent(Student student)
    {
        dao.insertStudent(student);
    }
}
