/*
 * @(#)Application.java 2020. 10. 12.
 *
 * Copyright 2020. All rights Reserved.
 */
package com.tistory.ddoriya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.function.client.WebClient;

/**
 *
 * @author 이상준
 */
@SpringBootApplication
@EnableScheduling
public class Application {


	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.addListeners(new ApplicationPidFileWriter("../pid/application.pid"));
		springApplication.run(args).registerShutdownHook();
	}

	@Bean
	public WebClient webClient() {
		return WebClient.create();
	}
}
