package com.app.app.controller;

import com.app.app.entity.Expert_customize;
import com.app.app.entity.Service;
import com.app.app.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

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
    public List<Expert_customize> searchExpert(HttpServletRequest request) {
        String name=request.getParameter("name");
        String specialty=request.getParameter("specialty");
        String position=request.getParameter("position");
        String school=request.getParameter("school");
        return searchService.getExpert(name,specialty,school,position);
    }

    @RequestMapping(value="/searchService",method= RequestMethod.GET)
    @ResponseBody
    public List<Service> searchService(HttpServletRequest request) {
        String title=request.getParameter("title");
        String specialty=request.getParameter("specialty");
        String position=request.getParameter("position");
        String school=request.getParameter("school");
        return searchService.getService(title,specialty,school,position);
    }

    @RequestMapping(value="/getList/{field}",method= RequestMethod.GET)
    @ResponseBody
    public List<String> getTotal(@PathVariable String field) {
        return searchService.getTotal(field);
    }

}


