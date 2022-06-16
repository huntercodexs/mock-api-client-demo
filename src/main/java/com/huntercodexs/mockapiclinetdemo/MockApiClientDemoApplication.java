package com.huntercodexs.mockapiclinetdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration
public class MockApiClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockApiClientDemoApplication.class, args);
	}
}
