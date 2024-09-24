
package com.onlinegame.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Competition() {}

    public Competition(String name, LocalDateTime startDate, LocalDateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters e Setters
}
