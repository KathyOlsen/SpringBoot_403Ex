package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String course(){
        return "course";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/teacher")
    public String admin(){
        return "teacher";
    }

    @RequestMapping("/student")
    public String user(){
        return "student";
    }

}
