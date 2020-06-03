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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "redirect:rest/REST_TEST";
    }



    @RequestMapping(value = "/rest/REST_TEST", method = RequestMethod.GET)
    public String test() {
        return "rest/REST_TEST";
    }

}
