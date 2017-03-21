package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.Headers;

//@FeignClient(name="greeting",configuration = FeignClientConfiguration.class)
@FeignClient(name="greeting",configuration = FeignClientConfiguration.class, fallback = GreetingFeignResourceImpl.class)
@Headers("Content-Type: application/json")
public interface GreetingFeignResource {
    
    @RequestMapping(method = RequestMethod.GET, value = "/message/{name}")
    String getMessage(@PathVariable("name") String name);

    
    @RequestMapping(method = RequestMethod.GET, value = "/message")
    Message getGreeting();
    
    @RequestMapping(method = RequestMethod.POST, value = "/message")
    void updateMessage(@RequestBody Message message);
    
}


