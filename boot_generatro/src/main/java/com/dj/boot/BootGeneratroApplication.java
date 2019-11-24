package com.dj.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dj.boot.mapper")
public class BootGeneratroApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootGeneratroApplication.class, args);
        System.out.println("BootGeneratroApplication.....successfully..............");
    }

}
