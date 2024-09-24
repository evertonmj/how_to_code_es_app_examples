
package com.fintechinnovations.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoInvestimento;
    private BigDecimal valor;

    public Investimento() {}

    public Investimento(String tipoInvestimento, BigDecimal valor) {
        this.tipoInvestimento = tipoInvestimento;
        this.valor = valor;
    }

    // Getters e Setters
}
