package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.entities.concretes.Order;

import java.util.Date;
import java.util.List;

public interface OrderService {
    List<Order> findAllOrdersOrderByOrder_date(int id);

    //List<Order> findAllProductsUnitPriceBetween(int id);
}
