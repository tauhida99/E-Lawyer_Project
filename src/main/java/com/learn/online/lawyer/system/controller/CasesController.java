package com.learn.online.lawyer.system.controller;

import com.learn.online.lawyer.system.entity.Cases;
import com.learn.online.lawyer.system.service.CasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CasesController {

    @Autowired
    private CasesService casesService;

    @GetMapping("/cases_reg_form")
   public String showCasesRegForm(Model model){
       Cases cases = new Cases();
       model.addAttribute("cases",cases);
       return "/forms/cases_form";

   }

    @PostMapping("/save/cases")
    public String saveCases(Cases cases) {
        casesService.saveAllCasesRegistered(cases);
        return "redirect:/";

    }
    @GetMapping("/view_cases_form")
    public String viewCasesForm(Model model){
        List<Cases> casesList = casesService.showAllcases();
        model.addAttribute("casesList",casesList);
        return "/signup-form/view_cases_form";
    }


}
