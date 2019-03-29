package com.springboot.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.springboot.Demo")
public class springbootDemoApplication {
    public static void main(String[] args){
        SpringApplication.run(springbootDemoApplication.class, args);
    }
}
