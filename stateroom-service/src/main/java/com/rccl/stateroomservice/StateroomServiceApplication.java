package com.rccl.stateroomservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StateroomServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StateroomServiceApplication.class, args);
    }

}
