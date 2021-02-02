package com.example.demoweb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Demoweb1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demoweb1Application.class, args);
    }

}
