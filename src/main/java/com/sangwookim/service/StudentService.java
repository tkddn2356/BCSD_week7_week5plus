package com.sangwookim.service;

import com.sangwookim.beans.StudentBean;
import com.sangwookim.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private UserDao userdao;

    public ArrayList<StudentBean> getStudentsInfo(){
        return userdao.getStudentsInfo();
    }

    public StudentBean getStudentInfo(StudentBean student) {
        return userdao.getStudentInfo(student);
    }
    public int addStudentInfo(StudentBean student){
        if(userdao.addStudentInfo(student) == 1){
            System.out.println("등록성공");
            return 1;
        }
        else {
            System.out.println("등록실패");
        }
        return -1;
    }

    public int deleteStudentInfo(StudentBean student){
        if(userdao.deleteStudentInfo(student) == 1){
            System.out.println("삭제성공");
            return 1;
        }
        else {
            System.out.println("삭제실패");
        }
        return -1;
    }

    public int updateStudentInfo(StudentBean student){
        if(userdao.updateStudentInfo(student) == 1){
            System.out.println("수정성공");
            return 1;
        }
        else {
            System.out.println("수정실패");
        }
        return -1;
    }



}
