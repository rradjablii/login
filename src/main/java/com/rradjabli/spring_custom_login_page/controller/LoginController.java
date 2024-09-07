package com.rradjabli.spring_custom_login_page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/")
    public String dashboard(){
        return "dashboard";
    }

}
