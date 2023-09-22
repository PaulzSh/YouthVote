package com.votez;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.votez.*")
@MapperScan({"com.votez.*"})
@EnableAutoConfiguration
public class SpringBootVotezApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootVotezApplication.class, args);

	}

}
