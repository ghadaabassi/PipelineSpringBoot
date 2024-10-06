package com.micro.jenkinspipelinespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsPipelineSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPipelineSpringBootApplication.class, args);
	}

	@GetMapping("/test")
	public String hello(){
		return "Hello World";
	}
}
