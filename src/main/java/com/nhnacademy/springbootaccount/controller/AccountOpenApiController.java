package com.nhnacademy.springbootaccount.controller;

import com.nhnacademy.springbootaccount.domain.Account;
import com.nhnacademy.springbootaccount.service.DefaultAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Account 시스템 Open API 서버 RestController.
 */
@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountOpenApiController {
    private final DefaultAccountService accountService;

    @GetMapping
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {
        return accountService.getAccount(number);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @DeleteMapping("/{number}")
    public String deleteAccount(@PathVariable String number) {
        return accountService.deleteAccount(number);
    }
}
