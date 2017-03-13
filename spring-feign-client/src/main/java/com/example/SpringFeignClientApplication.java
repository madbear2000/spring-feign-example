package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringFeignClientApplication implements CommandLineRunner {

    @Autowired 
    private HelloFiegn helloFiegn;
    
    
	public static void main(String[] args) {
		SpringApplication.run(SpringFeignClientApplication.class, args);
	}

    @Override
    public void run(String... arg0) throws Exception {
       
        System.out.println(helloFiegn.getMessage());
        
        
    }
}
