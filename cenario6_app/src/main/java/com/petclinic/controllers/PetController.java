
package com.petclinic.controllers;

import com.petclinic.models.Pet;
import com.petclinic.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping
    public List<Pet> listarTodosPets() {
        return petRepository.findAll();
    }

    @PostMapping
    public Pet criarPet(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }
}
