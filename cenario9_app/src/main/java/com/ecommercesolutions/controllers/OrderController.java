
package com.ecommercesolutions.controllers;

import com.ecommercesolutions.models.Order;
import com.ecommercesolutions.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> listarTodasOrdens() {
        return orderRepository.findAll();
    }

    @PostMapping
    public Order criarOrdem(@RequestBody Order order) {
        return orderRepository.save(order);
    }
}
