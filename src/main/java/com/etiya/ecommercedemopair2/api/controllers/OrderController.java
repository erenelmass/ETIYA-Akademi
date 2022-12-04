package com.etiya.ecommercedemo2.api.controllers;

import com.etiya.ecommercedemo2.business.abstracts.OrderService;
import com.etiya.ecommercedemo2.entities.concretes.Order;
import com.etiya.ecommercedemo2.entities.concretes.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/getAll")
    public List<Order> getAll(@RequestParam("id") int id ){
        return orderService.findAllOrdersOrderByOrder_date(id);
    }
    @GetMapping("/getById")
    public List<Order> findAllProductsUnitPriceBetween(@RequestParam("id") int id){
        return orderService.findAllProductsUnitPriceBetween(id);
    }
}
