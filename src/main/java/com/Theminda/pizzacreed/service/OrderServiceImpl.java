package com.Theminda.pizzacreed.service;

import com.Theminda.pizzacreed.repository.OrderRepository;
import com.Theminda.pizzacreed.dao.Order;
import com.Theminda.pizzacreed.dao.ShoppingBasket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Transactional
    public Order checkout(ShoppingBasket shoppingBasket) {
        //TODO: Implement this method
        return null;
    }
}
