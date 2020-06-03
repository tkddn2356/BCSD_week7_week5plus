package com.sangwookim.dao;

import com.sangwookim.beans.StudentBean;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {


    private static String className = "com.mysql.jdbc.Driver";
    private static String dbUrl = "jdbc:mysql://localhost:3306/college";
    private static String dbUser = "root";
    private static String DbPassword = "rnsan4226";

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public StudentBean getStudentInfo(StudentBean studentBean) {
        StudentBean student = null;
        try {
            Class.forName(className);
            conn = DriverManager.getConnection(dbUrl, dbUser, DbPassword);

            String query = "SELECT * FROM student where name = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, studentBean.getName());

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("student_id");
                String name = rs.getString("name");
                int department_number = rs.getInt("department_number");
                int department_id = rs.getInt("department_id");
                String created_date = rs.getString("created_date");
                String update_date = rs.getString("update_date");


                student = new StudentBean();
                student.setStudent_id(id);
                student.setName(name);
                student.setDepartment_number(department_number);
                student.setDepartment_id(department_id);
                student.setCreated_date(created_date);
                student.setUpdate_date(update_date);

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error!");
            e.printStackTrace();
        }
        return student;

    }

    public ArrayList<StudentBean> getStudentsInfo() {
        ArrayList<StudentBean> studentList = new ArrayList<StudentBean>();
        try {
            Class.forName(className);
            conn = DriverManager.getConnection(dbUrl, dbUser, DbPassword);

            String query = "SELECT * FROM student";
            ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("student_id");
                String name = rs.getString("name");
                int department_number = rs.getInt("department_number");
                int department_id = rs.getInt("department_id");
                String created_date = rs.getString("created_date");
                String update_date = rs.getString("update_date");


                StudentBean student = new StudentBean();
                student.setStudent_id(id);
                student.setName(name);
                student.setDepartment_number(department_number);
                student.setDepartment_id(department_id);
                student.setCreated_date(created_date);
                student.setUpdate_date(update_date);


                studentList.add(student);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error!");
            e.printStackTrace();
        }
        return studentList;

    }

    public int updateStudentInfo(StudentBean studentBean) {

        int result = 0;
        try {
            Class.forName(className);
            conn = DriverManager.getConnection(dbUrl, dbUser, DbPassword);
            String query = "UPDATE student SET department_id = ?, department_number = ? WHERE name = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, studentBean.getDepartment_id());
            ps.setInt(2, studentBean.getDepartment_number());
            ps.setString(3, studentBean.getName());
            result = ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error!");
            e.printStackTrace();
        }
        return result;




    }

    public int deleteStudentInfo(StudentBean studentBean) {
        int result = 0;
        try {
            Class.forName(className);
            conn = DriverManager.getConnection(dbUrl, dbUser, DbPassword);
            String query = "DELETE from student where name=? AND department_id=?";
            ps = conn.prepareStatement(query);
            ps.setString(1, studentBean.getName());
            ps.setInt(2, studentBean.getDepartment_id());
            result = ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error!");
            e.printStackTrace();
        }
        return result;

    }


    public int addStudentInfo(StudentBean studentBean) {

        int result = 0;
        try {
            Class.forName(className);
            conn = DriverManager.getConnection(dbUrl, dbUser, DbPassword);

            String query = "INSERT INTO student (name, department_number, department_id) values(?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, studentBean.getName());
            ps.setInt(2, studentBean.getDepartment_number());
            ps.setInt(3, studentBean.getDepartment_id());


            result = ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error!");
            e.printStackTrace();
        }
        return result;
    }
}
