package com.nhnacademy.springbootaccount;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();

    Account createAccount(Account account);

    Account getAccount(String number);

    void deleteAccount(String number);
}
