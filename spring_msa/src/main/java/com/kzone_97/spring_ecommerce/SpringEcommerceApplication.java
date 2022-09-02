package com.kzone_97.spring_ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEcommerceApplication.class, args);
    }

}
