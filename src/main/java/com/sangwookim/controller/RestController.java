package com.sangwookim.controller;

import com.sangwookim.beans.StudentBean;
import com.sangwookim.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class RestController {

    @Autowired
    private StudentService studentService;



    @RequestMapping(value = "/students", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ArrayList<StudentBean>> list() {

        ArrayList<StudentBean> list = studentService.getStudentsInfo();

        ResponseEntity<ArrayList<StudentBean>> entry = new ResponseEntity<ArrayList<StudentBean>>(list, HttpStatus.OK);

        return entry;
    }

    @RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<StudentBean> read(@PathVariable("name") String name,
                                            StudentBean student) {

        StudentBean studentInfo = studentService.getStudentInfo(student);

        ResponseEntity<StudentBean> entry = new ResponseEntity<StudentBean>(studentInfo, HttpStatus.OK);

        return entry;
    }


    @RequestMapping(value = "/students/{name}", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<StudentBean> register(@PathVariable("name") String name,
                                                @RequestBody StudentBean student) {

        int result = studentService.addStudentInfo(student);

        ResponseEntity<StudentBean> entry = new ResponseEntity<StudentBean>(student, HttpStatus.OK);

        return entry;
    }

    @RequestMapping(value = "/students/{name}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<StudentBean> delete(@PathVariable("name") String name,
                                              @RequestBody StudentBean student) {

        int result = studentService.deleteStudentInfo(student);

        ResponseEntity<StudentBean> entry = new ResponseEntity<StudentBean>(student, HttpStatus.OK);

        return entry;
    }


    @RequestMapping(value = "/students/{name}", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<StudentBean> modify(@PathVariable("name") String name,
                                              @RequestBody StudentBean student) {

        int result = studentService.updateStudentInfo(student);

        ResponseEntity<StudentBean> entry = new ResponseEntity<StudentBean>(student, HttpStatus.OK);

        return entry;
    }


}
