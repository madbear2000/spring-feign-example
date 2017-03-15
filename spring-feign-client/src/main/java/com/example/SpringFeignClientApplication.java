package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringFeignClientApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Autowired 
    private GreetingFeignResource greetingFeignResource;
    
    
	public static void main(String[] args) {
		SpringApplication.run(SpringFeignClientApplication.class, args);
	}

    @Override
    public void run(String... arg0) throws Exception {
       
    	String newGreeting = "Lá breá duit";
    	String name = "Sean";
    	
    	logger.info("Example Feign Client with no auth");
    	String result1 = greetingFeignResource.getMessage(name);
        logger.info(result1);
        
        logger.info("Updating message to: {}", newGreeting);
        
        greetingFeignResource.updateMessage(newGreeting);
        
        String result2 = greetingFeignResource.getMessage(name);
        
        logger.info(result2);
    }
}