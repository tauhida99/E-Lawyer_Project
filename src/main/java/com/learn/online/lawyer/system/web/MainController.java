package com.learn.online.lawyer.system.web;

import com.learn.online.lawyer.system.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    private String show_Main_Home_Page(){
        return"index";
    }


    @GetMapping("/open_login_form")
   public String ShowLoginForm(){
        return "/login/login";
   }
   @GetMapping("/dashboard")
   public String showDashboard(){
        return "/dashboard/admin";
   }

}
