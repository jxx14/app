package com.app.app.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class SearchController {

    @RequestMapping(value="/searchExpert",method= RequestMethod.GET)
    @ResponseBody
    public String searchExpert(HttpServletRequest request) {
        String name=request.getParameter("name");
        String speciality=request.getParameter("speciality");
        String position=request.getParameter("position");
        String school=request.getParameter("school");
        return "good";

    }


}


