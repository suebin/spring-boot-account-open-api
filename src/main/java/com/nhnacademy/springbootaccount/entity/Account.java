package com.nhnacademy.springbootaccount.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    private String number;
    private Integer balance;
}
