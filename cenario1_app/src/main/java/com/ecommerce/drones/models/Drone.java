
package com.ecommerce.drones.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String status;
    private double capacidadeCarga;
    private double bateria;

    public Drone() {}

    public Drone(String modelo, String status, double capacidadeCarga, double bateria) {
        this.modelo = modelo;
        this.status = status;
        this.capacidadeCarga = capacidadeCarga;
        this.bateria = bateria;
    }

    // Getters e Setters
}
