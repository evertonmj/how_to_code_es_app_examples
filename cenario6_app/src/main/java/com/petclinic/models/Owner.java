
package com.petclinic.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pet> pets;

    public Owner() {}

    public Owner(String name, String phone, List<Pet> pets) {
        this.name = name;
        this.phone = phone;
        this.pets = pets;
    }

    // Getters e Setters
}
