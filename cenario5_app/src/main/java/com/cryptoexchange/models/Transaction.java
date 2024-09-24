
package com.cryptoexchange.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String cryptocurrency;
    private BigDecimal amount;
    private String transactionType; // buy or sell
    private LocalDateTime timestamp;

    public Transaction() {}

    public Transaction(String user, String cryptocurrency, BigDecimal amount, String transactionType, LocalDateTime timestamp) {
        this.user = user;
        this.cryptocurrency = cryptocurrency;
        this.amount = amount;
        this.transactionType = transactionType;
        this.timestamp = timestamp;
    }

    // Getters e Setters
}
