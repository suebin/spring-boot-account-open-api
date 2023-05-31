package com.nhnacademy.springbootaccount.controller;

import com.nhnacademy.springbootaccount.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AccountWebController {
    @GetMapping("/web/account/{id}")
    public String getAccount(@PathVariable Long id, Model model){
        model.addAttribute("account", new Account("1111", 100));
        return "account";
    }
}
