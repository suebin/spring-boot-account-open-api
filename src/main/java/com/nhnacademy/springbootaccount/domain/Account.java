package com.nhnacademy.springbootaccount.domain;

import lombok.*;

/**
 * Account.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String number;
    private Integer balance;
}
