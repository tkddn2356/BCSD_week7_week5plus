package com.sangwookim.service;

import com.sangwookim.beans.StudentBean;
//import com.sangwookim.dao.StudentDao;
import com.sangwookim.repository.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public ArrayList<StudentBean> getStudentList() {
        return studentMapper.getStudentList();
    }

    @Override
    public StudentBean getStudentInfo(StudentBean student) {
        return studentMapper.getStudentInfo(student);
    }

    @Override
    @Transactional
    public void addStudentInfo(StudentBean student) {
        studentMapper.addStudentInfo(student);
    }

    @Override
    public void deleteStudentInfo(StudentBean student) {
        studentMapper.deleteStudentInfo(student);
    }

    @Override
    public void modifyStudentInfo(StudentBean student) {
        studentMapper.modifyStudentInfo(student);
    }



}
