
package com.ecommercesolutions.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime orderDate;
    private BigDecimal totalAmount;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Product> products;

    public Order() {}

    public Order(LocalDateTime orderDate, BigDecimal totalAmount, Customer customer, List<Product> products) {
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.customer = customer;
        this.products = products;
    }

    // Getters e Setters
}
