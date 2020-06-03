package com.sangwookim.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
