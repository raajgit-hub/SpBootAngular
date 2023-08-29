package com.userreg.UserRegistration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class MainController {

    @RequestMapping("/addstudent")
    public String addStudent() {
        return "addStudent.html";
    }
    
    
}
