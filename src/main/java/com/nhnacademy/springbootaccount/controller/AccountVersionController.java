package com.nhnacademy.springbootaccount.controller;

import com.nhnacademy.springbootaccount.configuration.AccountProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountVersionController {
    private final AccountProperties accountProperties;

    @GetMapping("/system/version")
    public String getVersion() {
        return "{\"version\":\" " + accountProperties.getVersion()  + "}";
    }
}
