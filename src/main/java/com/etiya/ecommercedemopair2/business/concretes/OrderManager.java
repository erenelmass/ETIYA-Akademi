package com.etiya.ecommercedemo2.business.concretes;

import com.etiya.ecommercedemo2.business.abstracts.OrderService;
import com.etiya.ecommercedemo2.entities.concretes.Order;
import com.etiya.ecommercedemo2.repository.abstracts.OrderRepositoy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class OrderManager implements OrderService {
    private OrderRepositoy orderRepositoy;
    @Override
    public List<Order> findAllOrdersOrderByOrder_date(int id) {
        return orderRepositoy.getAllOrdersOrderById(id);
        //return null;
    }
    public List<Order> findAllProductsUnitPriceBetween(int id){
        return orderRepositoy.findAllProductsUnitPriceBetween(id);
    }
}
