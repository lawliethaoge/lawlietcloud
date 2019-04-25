package com.lawliet.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author KongHao lawliet.haoge@gmail.com
 * 2019/4/24 10:32
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderUserApplication.class, args);
    }

}
