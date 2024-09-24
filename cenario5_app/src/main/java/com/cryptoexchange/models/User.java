
package com.cryptoexchange.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private double balance;

    public User() {}

    public User(String username, String email, double balance) {
        this.username = username;
        this.email = email;
        this.balance = balance;
    }

    // Getters e Setters
}
