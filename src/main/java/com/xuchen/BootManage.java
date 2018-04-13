package com.xuchen;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuchen.mapper")
public class BootManage {
	public static void main(String[] args) {
		SpringApplication.run(BootManage.class, args);
	}
}
