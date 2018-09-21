package com.imooc.manager;

import com.imooc.swagger.EnableMySwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


/**
 * springBoot 启动类
 */
//@EnableSwagger2
@SpringBootApplication
@EntityScan(basePackages = { "com.imooc.entity" })
//@Import(SwaggerConfiguration.class)
@EnableMySwagger
public class ManagerApp {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApp.class);
    }
}
