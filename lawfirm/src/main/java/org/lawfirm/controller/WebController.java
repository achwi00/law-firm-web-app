package org.lawfirm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/home")
    public String home() {
        return "index.html";
    }

    @RequestMapping("/log")
    public String log(){return "login-page.html";}

    @RequestMapping("/register")
    public String toRegister(){return "registration_page.html";}

//    @RequestMapping("/login")
//    public String login() {return "login-page.html";}
//    @GetMapping("/login-page")
//    public String login() {
//        return "login-page.html";
//    }
}
