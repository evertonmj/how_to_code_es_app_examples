
package com.fintechinnovations.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destinatario;
    private BigDecimal valor;

    public Pagamento() {}

    public Pagamento(String destinatario, BigDecimal valor) {
        this.destinatario = destinatario;
        this.valor = valor;
    }

    // Getters e Setters
}
