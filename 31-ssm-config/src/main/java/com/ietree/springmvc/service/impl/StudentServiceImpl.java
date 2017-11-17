package com.ietree.springmvc.service.impl;

import com.ietree.springmvc.beans.Student;
import com.ietree.springmvc.dao.IStudentDao;
import com.ietree.springmvc.service.IStudentService;

public class StudentServiceImpl implements IStudentService
{
    private IStudentDao dao;

    public void setDao(IStudentDao dao)
    {
        this.dao = dao;
    }

    @Override
    public void addStudent(Student student)
    {
        dao.insertStudent(student);
    }
}
