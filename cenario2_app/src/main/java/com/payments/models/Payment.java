
package com.payments.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String securityCode;
    private BigDecimal amount;

    public Payment() {}

    public Payment(String cardNumber, String cardHolderName, String expirationDate, String securityCode, BigDecimal amount) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.amount = amount;
    }

    // Getters e Setters
}
