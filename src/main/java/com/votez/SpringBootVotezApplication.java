package com.votez;

import com.votez.common.config.DynamoDBConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.votez.*")
@ComponentScan(basePackages = "com.votez.*")
@EnableAutoConfiguration
public class SpringBootVotezApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DynamoDBConfig.class);
        SpringApplication.run(SpringBootVotezApplication.class, args);
    }

}
