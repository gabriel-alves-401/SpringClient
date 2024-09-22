package com.github.io.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringTestApplication {
	@Value("${spring.application.name}")
	private String applicationName;

	@Autowired
	@Qualifier("index")
	private String index;

	@GetMapping("/")
	public String index(){
		return index;
	}

	@GetMapping("/applicationName")
	public String applicationName(){
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}
	
}
