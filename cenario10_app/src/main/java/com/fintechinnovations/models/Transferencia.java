
package com.fintechinnovations.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String origem;
    private String destino;
    private BigDecimal valor;

    public Transferencia() {}

    public Transferencia(String origem, String destino, BigDecimal valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    // Getters e Setters
}
