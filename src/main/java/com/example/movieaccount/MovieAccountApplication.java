package com.example.movieaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieAccountApplication.class, args);
    }

}
