package com.nhnacademy.springbootaccount;

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
