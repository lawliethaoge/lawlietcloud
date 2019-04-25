package com.lawliet.movie.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author KongHao  lawliet.haoge@gmail.com
 * 2019/4/21 20:48
 */
@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User implements Serializable {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
