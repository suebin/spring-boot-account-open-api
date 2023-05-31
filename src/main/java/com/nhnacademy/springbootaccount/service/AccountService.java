package com.nhnacademy.springbootaccount.service;

import com.nhnacademy.springbootaccount.domain.Account;
import java.util.List;

/**
 * Account 시스템 Service Interface.
 */
public interface AccountService {
    List<Account> getAccounts();

    Account getAccount(String number);

    Account createAccount(Account account);

    String deleteAccount(String number);
}
