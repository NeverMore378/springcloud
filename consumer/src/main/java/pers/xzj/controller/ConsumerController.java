package pers.xzj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public String test(){
        return restTemplate.getForObject("http://localhost:9991/hello",String.class);
    }



    @GetMapping("/test2")
    public String test2(){
//        获取eureka中注册的provider的实例
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("provider");
        ServiceInstance serviceInstance = serviceInstances.get(0);
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello2";
        return restTemplate.getForObject(url,String.class);
    }
}
