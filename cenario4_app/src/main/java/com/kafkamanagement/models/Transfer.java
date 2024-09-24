
package com.kafkamanagement.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fromUser;
    private String toUser;
    private BigDecimal amount;

    public Transfer() {}

    public Transfer(String fromUser, String toUser, BigDecimal amount) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
    }

    // Getters e Setters
}
