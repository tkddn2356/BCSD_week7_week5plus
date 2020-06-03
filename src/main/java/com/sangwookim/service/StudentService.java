package com.sangwookim.service;

import com.sangwookim.beans.StudentBean;

import java.util.ArrayList;

public interface StudentService {
    public ArrayList<StudentBean> getStudentList();
    public StudentBean getStudentInfo(StudentBean student);
    void addStudentInfo(StudentBean student);
    void deleteStudentInfo(StudentBean student);
    void modifyStudentInfo(StudentBean student);
}

