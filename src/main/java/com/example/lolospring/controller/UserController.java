package com.example.lolospring.controller;

import com.example.lolospring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    IUserService iUserService;

    @ResponseBody
    @GetMapping("/getUserById")
    public String getUserById(@RequestParam String id){

        iUserService.printUser(Integer.valueOf(id));

        return "succ";
    }
}
