package com.app.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping(value="/")
    public String print(){
        System.out.print("helloworld");
        return "helloworld";
    }
}
