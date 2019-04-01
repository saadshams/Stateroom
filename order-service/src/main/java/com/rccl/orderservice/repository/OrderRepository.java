package com.rccl.orderservice.repository;

import com.rccl.orderservice.model.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderRepository {

    private List<Order> orderList = new ArrayList<>();

    private int id = 0;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    List<Order> getOrderList() {
        return orderList;
    }

    @RequestMapping(value = "/orders/{menuId}/{roomId}", method = RequestMethod.POST)
    void add(@PathVariable("menuId") int menuId, @PathVariable("roomId") int roomId) {
        orderList.add(new Order(++id, menuId, roomId));
    }

}
