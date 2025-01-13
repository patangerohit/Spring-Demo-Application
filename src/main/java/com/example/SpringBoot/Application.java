package com.example.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
