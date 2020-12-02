package com.stu.stuback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类
 */
@SpringBootApplication
@MapperScan("com.stu.stuback.mapper")
@ServletComponentScan
public class StubackApplication {

    public static void main(String[] args) {
        SpringApplication.run(StubackApplication.class, args);
    }

}
