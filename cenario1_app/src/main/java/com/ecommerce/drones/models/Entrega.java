
package com.ecommerce.drones.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enderecoDestino;
    private String produto;
    private LocalDateTime dataEntrega;

    @ManyToOne
    private Drone drone;

    public Entrega() {}

    public Entrega(String enderecoDestino, String produto, LocalDateTime dataEntrega, Drone drone) {
        this.enderecoDestino = enderecoDestino;
        this.produto = produto;
        this.dataEntrega = dataEntrega;
        this.drone = drone;
    }

    // Getters e Setters
}
