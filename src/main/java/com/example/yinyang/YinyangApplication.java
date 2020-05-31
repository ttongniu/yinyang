package com.example.yinyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@MapperScan(value = "com.example.yinyang.dao")
public class YinyangApplication  {

	public static void main(String[] args) {
		SpringApplication.run(YinyangApplication.class, args);
	}


}
