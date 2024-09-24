
package com.softwarefactory.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String expertise;

    public Developer() {}

    public Developer(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    // Getters e Setters
}
