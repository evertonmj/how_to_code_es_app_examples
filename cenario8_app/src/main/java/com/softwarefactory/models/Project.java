
package com.softwarefactory.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public Project() {}

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters e Setters
}
