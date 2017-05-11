package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringFeignServerApplication {
    
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @RestController
    @RequestMapping("/")
    public class ComputeController {
    	
    	private String welcome = "Welcome to Feign"; 

        @GetMapping("/message/{name}")
        public String add(@PathVariable(value="name") String name) {
            
            logger.info("Received request from {} for a greeting.", name);
            
            return welcome + " " + name;
        }
        
        @PostMapping("/message/{greeting}") 
        public void updateGreeting(@PathVariable(value="greeting") String greeting) {
        	welcome = greeting;
        	
        	logger.info("Greeting update to {}", welcome);
        }
    }
    
    
    
	public static void main(String[] args) {
		SpringApplication.run(SpringFeignServerApplication.class, args);
	}
}
