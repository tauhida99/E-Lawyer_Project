package com.learn.online.lawyer.system.controller;

import com.learn.online.lawyer.system.entity.User;
import com.learn.online.lawyer.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user_reg_form")
    private String showNewUserRegForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "/signup-forms/user_form";
    }

    @PostMapping("/save/client")
    public String saveUser(User user) {
        userService.saveUsers(user);
        return "redirect:/view_user_form";
    }

    @GetMapping("/view_user_form")
    public String viewAllUserRegistered(Model model){
        List<User> userList = userService.displayAllUser();
        model.addAttribute("userList",userList);
       return "/signup-forms/view_form";

    }

    @GetMapping("/edit/form/{userid}")
    public String editAllUserDetails(Model model,@PathVariable Integer userid){
        User user = userService.updateAllUser(userid);
        model.addAttribute("user",user);
        return "/signup-forms/edit_form";

    }
    @GetMapping("/delete/form/{userid}")
   public String deleteUser(@PathVariable Integer userid){
        userService.deleteAllUser(userid);
        return "redirect:/view_user_form";
   }
}
