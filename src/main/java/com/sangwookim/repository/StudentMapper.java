package com.sangwookim.repository;

import com.sangwookim.beans.StudentBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StudentMapper {
    @Select(value="select * from student")
    ArrayList<StudentBean> getStudentList();

    @Select(value="select * from student where name = #{name}")
    StudentBean getStudentInfo(StudentBean studentBean);

    @Insert(value="insert into student (name, department_number, department_id) values(#{name}, #{department_number}, #{department_id}")
    void addStudentInfo(StudentBean student);

    @Delete(value="delete from student where name=#{name} and department_id=#{department_id}")
    void deleteStudentInfo(StudentBean student);

    @Update(value="UPDATE student SET department_id = #{department_id}, department_number = #{department_number} WHERE name = #{name}")
    void modifyStudentInfo(StudentBean student);

}
