package com.sangwookim.beans;

public class StudentBean {
    private int student_id;
    private String name;
    private int department_number;
    private int department_id;
    private String created_date;
    private String update_date;

    public StudentBean() {
        this.student_id = 1;
        this.name = "name";
        this.department_number = 1;
        this.department_id = 1;
        this.created_date = "";
        this.update_date = "";
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }


}
