package com.app.app.controller;

import com.app.app.entity.Expert_customize;
import com.app.app.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@SpringBootApplication
@RestController
@ComponentScan(basePackages={"com.app.app.service"})
public class SearchController {

    @Autowired
    SearchService searchService;

    @RequestMapping(value="/searchExpert",method= RequestMethod.GET)
    @ResponseBody
    public String searchExpert(HttpServletRequest request) {
        String name=request.getParameter("name");
        String speciality=request.getParameter("speciality");
        String position=request.getParameter("position");
        String school=request.getParameter("school");
        List<Expert_customize> expertList = searchService.getExpert(name,speciality,school,position);
        return "good: " + expertList.get(0).school;

    }


}


