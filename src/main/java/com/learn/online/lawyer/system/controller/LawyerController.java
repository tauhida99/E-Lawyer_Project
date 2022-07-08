package com.learn.online.lawyer.system.controller;

import com.learn.online.lawyer.system.entity.Cases;
import com.learn.online.lawyer.system.entity.Lawyer;
import com.learn.online.lawyer.system.service.CasesService;
import com.learn.online.lawyer.system.service.LawyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LawyerController {
    @Autowired
    private LawyerService lawyerService;

    @GetMapping("/lawyer_reg_form")
    public String showLAwyerRegForm(Model model){
        Lawyer lawyer = new Lawyer();
        model.addAttribute("lawyer",lawyer);
        return "/forms/lawyer_form";
    }

    @PostMapping("/save/lawyer")
    public String addLawyerDetails(Lawyer lawyer){
        lawyerService.saveAllLawyerDetails(lawyer);
        return "redirect:/";
    }




}
