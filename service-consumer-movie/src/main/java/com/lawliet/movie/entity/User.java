package com.lawliet.movie.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author KongHao  lawliet.haoge@gmail.com
 * 2019/4/21 20:48
 */
@Data
public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
