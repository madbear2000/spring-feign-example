package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringFeignServerApplication {
    
    @RestController
    @RequestMapping("/")
    public class ComputeController {

        @GetMapping("/message")
        public String add() {
            
            System.out.println("got message");
            
            
            return "Welcome to Feign";
        }
    }
    
    
	public static void main(String[] args) {
		SpringApplication.run(SpringFeignServerApplication.class, args);
	}
}
