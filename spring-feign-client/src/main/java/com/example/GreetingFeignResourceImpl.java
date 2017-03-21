package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GreetingFeignResourceImpl implements GreetingFeignResource{
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Override
    public String getMessage(String name) {
        return "I am sorry " + name + ". I cannot talk right now.";
    }

    @Override
    public void updateMessage(Message message) {
        logger.warn("Failed to send update message to server");
    }

    @Override
    public Message getGreeting() {
        // TODO Auto-generated method stub
        return new Message("No Result found", "Fallover");
    }

}