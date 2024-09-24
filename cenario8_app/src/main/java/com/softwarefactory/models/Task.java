
package com.softwarefactory.models;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String status;

    @ManyToOne
    private Project project;

    @ManyToOne
    private Developer developer;

    public Task() {}

    public Task(String description, String status, Project project, Developer developer) {
        this.description = description;
        this.status = status;
        this.project = project;
        this.developer = developer;
    }

    // Getters e Setters
}
