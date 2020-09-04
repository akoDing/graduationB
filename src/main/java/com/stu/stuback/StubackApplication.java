package com.stu.stuback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stu.stuback.mapper")
public class StubackApplication {

    public static void main(String[] args) {
        SpringApplication.run(StubackApplication.class, args);
    }

}
