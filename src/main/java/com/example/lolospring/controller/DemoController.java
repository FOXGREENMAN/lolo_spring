package com.example.lolospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {


    @ResponseBody
    @RequestMapping("/demo")
    public String demo(){
        return "<h1>This is lolo's spring demo</h1>";
    }
}
