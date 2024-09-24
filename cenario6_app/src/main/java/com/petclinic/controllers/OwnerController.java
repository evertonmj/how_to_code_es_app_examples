
package com.petclinic.controllers;

import com.petclinic.models.Owner;
import com.petclinic.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @GetMapping
    public List<Owner> listarTodosDonos() {
        return ownerRepository.findAll();
    }

    @PostMapping
    public Owner criarDono(@RequestBody Owner owner) {
        return ownerRepository.save(owner);
    }
}
