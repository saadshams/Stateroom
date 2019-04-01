package com.rccl.stateroomservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

@RestController
public class StateroomRepository {

    @Bean
    @LoadBalanced
    public static RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/menu")
    public List<Object> getMenu() {
        return restTemplate.getForObject("http://menu-service/menu", List.class);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<Object> getOrders() {
        return restTemplate.getForObject("http://order-service/orders", List.class);
    }

    @RequestMapping(value = "/orders/{menuId}/{roomId}", method = RequestMethod.POST)
    public void add(@PathVariable("menuId") int menuId, @PathVariable("roomId") int roomId) {
        restTemplate.postForObject("http://order-service/orders/" + menuId + "/" + roomId, new HashMap<String, String>(), List.class);
    }

}
