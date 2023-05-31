package com.nhnacademy.springbootaccount;

import com.nhnacademy.springbootaccount.entity.Account;
import com.nhnacademy.springbootaccount.repository.AccountRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DefaultAccountServiceTest {
    @Autowired
    AccountRepository accountRepository;

    @Test
    void testGetAccounts() {
        Account account = new Account("1111", 1000);
        accountRepository.save(account);
        Account actual = accountRepository.findById("1111").get();
        Assertions.assertThat(actual).isEqualTo(account);
    }

}