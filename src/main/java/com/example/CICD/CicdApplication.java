package com.example.CICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {


	@GetMapping("/hello")
	public String checking(){
		return " ci cd with github actions";
	}

    @GetMapping("/status")
	public String status(){
		return "active";
	}



	@GetMapping("/check")
	public String verify(){
		return "hello world";
	}






	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
