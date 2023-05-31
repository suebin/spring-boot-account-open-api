package com.nhnacademy.springbootaccount;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping("/accounts/{number}")
    public Account getStudent(@PathVariable String number) {
        return accountService.getAccount(number);
    }

    @PostMapping("/accounts")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createStudent(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @DeleteMapping("/accounts/{number}")
    public String deleteAccount(@PathVariable String number) {
        accountService.deleteAccount(number);
        return "{\"result\":\"OK\"}";
    }
}
