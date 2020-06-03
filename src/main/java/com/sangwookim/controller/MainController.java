package com.sangwookim.controller;



import com.sangwookim.beans.StudentBean;
import com.sangwookim.dao.UserDao;
import com.sangwookim.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    //get 검색, 읽기 특화
    //post 읽기(보안), 쓰기
    //pacth 수정
    //deleted 삭제

//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String hello() {
//        System.out.println("안녕하세요");
//        return "Main";
//    }
//
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
//    public String helloword() {
//        System.out.println("home");
//        return "hello";
//    }

//    @Autowired
//    private StudentService studentService;
//
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "redirect:rest/REST_TEST";
    }
//    @RequestMapping(value = "/Main", method = RequestMethod.GET)
//    public String Main() {
//        return "Main";
//    }
//
//
//
//    @RequestMapping(value = "/input_data", method = RequestMethod.GET)
//    public String input_data(@ModelAttribute("inputStudentBean") StudentBean studentBean) {
//        return "input_data";
//    }
//
//    @RequestMapping(value = "/input_data_pro", method = RequestMethod.POST)
//    public String input_data_pro(@ModelAttribute("inputStudentBean") StudentBean studentBean) {
//        if(studentService.addStudentInfo(studentBean) == 1)
//        {
//            return "input_success";
//        }
//
//        return "input_data";
//    }
//
//    @RequestMapping(value = "/read_data", method = RequestMethod.GET)
//    public String read_data(Model model) {
//
//        List<StudentBean> list = studentService.getStudentsInfo();
//
//        model.addAttribute("list", list);
//
//        return "read_data";
//    }
//
//    @RequestMapping(value = "/delete_data", method = RequestMethod.GET)
//    public String delete_data(@ModelAttribute("deleteStudentBean") StudentBean studentBean) {
//        return "delete_data";
//    }
//
//    @RequestMapping(value = "/delete_data_pro", method = RequestMethod.POST)
//    public String delete_data_pro(@ModelAttribute("deleteStudentBean") StudentBean studentBean) {
//        if(studentService.deleteStudentInfo(studentBean) == 1)
//        {
//            return "delete_success";
//        }
//        return "delete_data";
//    }
//
//    @RequestMapping(value = "/update_data", method = RequestMethod.GET)
//    public String update_data(@ModelAttribute("updateStudentBean") StudentBean studentBean) {
//        return "update_data";
//    }
//
//    @RequestMapping(value = "/update_data_pro", method = RequestMethod.POST)
//    public String update_data_pro(@ModelAttribute("updateStudentBean") StudentBean studentBean) {
//        if(studentService.updateStudentInfo(studentBean) == 1)
//        {
//            return "update_success";
//        }
//        return "update_data";
//    }



    @RequestMapping(value = "/rest/REST_TEST", method = RequestMethod.GET)
    public String test() {
        return "rest/REST_TEST";
    }

}
