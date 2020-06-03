//package com.sangwookim.dao;
//
//import com.sangwookim.beans.StudentBean;
//import com.sangwookim.repository.StudentMapper;
//import org.apache.ibatis.annotations.Delete;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Select;
//import org.apache.ibatis.annotations.Update;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class StudentDao {
//    @Autowired
//    StudentMapper studentMapper;
//
//    public ArrayList<StudentBean> getStudentList(){
//        return studentMapper.getStudentList();
//    }
//
//    public StudentBean getStudentInfo(StudentBean studentBean) {
//        return studentMapper.getStudentInfo(studentBean);
//    }
//
//    public void addStudentInfo(StudentBean studentBean){
//        studentMapper.addStudentInfo(studentBean);
//    }
//
//    public void deleteStudentInfo(StudentBean studentBean){
//        studentMapper.deleteStudentInfo(studentBean);
//    }
//
//    public void modifyUserInfo(StudentBean studentBean){
//        studentMapper.modifyStudentInfo(studentBean);
//    }
//
//
//}
