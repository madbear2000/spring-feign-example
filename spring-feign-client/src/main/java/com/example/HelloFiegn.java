package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name="service",configuration = FeignClientConfiguration.class)
@FeignClient(name="foo",configuration = FeignClientConfiguration.class)
public interface HelloFiegn {
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/message")
    String getMessage();
    
}
