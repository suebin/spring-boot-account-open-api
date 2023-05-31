package com.nhnacademy.springbootaccount.service;

import com.nhnacademy.springbootaccount.configuration.ServerProperties;
import com.nhnacademy.springbootaccount.domain.Account;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * Account 시스템 Service.
 */
@Service
@RequiredArgsConstructor
public class DefaultAccountService implements AccountService {
    private final RestTemplate restTemplate;
    private final ServerProperties serverProperties;

    @Override
    @Transactional(readOnly = true)
    public List<Account> getAccounts() {
        HttpEntity<String> requestEntity = new HttpEntity<>(getHttpHeaders());
        ResponseEntity<List<Account>> exchange =
                restTemplate.exchange(serverProperties.getUrl(),
                        HttpMethod.GET,
                        requestEntity,
                        new ParameterizedTypeReference<>() {
                        });
        return exchange.getBody();
    }

    @Override
    @Transactional(readOnly = true)
    public Account getAccount(String number) {
        HttpEntity<String> requestEntity = new HttpEntity<>(getHttpHeaders());
        ResponseEntity<Account> exchange =
                restTemplate.exchange(serverProperties.getUrl() + "/" + number,
                        HttpMethod.GET,
                        requestEntity,
                        new ParameterizedTypeReference<>() {
                        });
        return exchange.getBody();
    }

    @Override
    @Transactional
    public Account createAccount(Account account) {
        HttpEntity<Account> requestEntity = new HttpEntity<>(account, getHttpHeaders());
        ResponseEntity<Account> exchange =
                restTemplate.exchange(serverProperties.getUrl(),
                        HttpMethod.POST,
                        requestEntity,
                        new ParameterizedTypeReference<>() {
                        });
        return exchange.getBody();
    }

    @Override
    @Transactional
    public String deleteAccount(String number) {
        HttpEntity<String> requestEntity = new HttpEntity<>(getHttpHeaders());
        ResponseEntity<String> exchange =
                restTemplate.exchange(serverProperties.getUrl() + "/" + number,
                        HttpMethod.DELETE,
                        requestEntity,
                        new ParameterizedTypeReference<>() {
                        });
        return exchange.getBody();
    }

    /**
     * HttpHeaders 를 만들어주는 메소드.
     *
     * @return httpHeaders
     */
    public HttpHeaders getHttpHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        return httpHeaders;
    }
}
