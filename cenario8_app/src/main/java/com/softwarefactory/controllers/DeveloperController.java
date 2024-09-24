
package com.softwarefactory.controllers;

import com.softwarefactory.models.Developer;
import com.softwarefactory.repositories.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

    @Autowired
    private DeveloperRepository developerRepository;

    @GetMapping
    public List<Developer> listarTodosDesenvolvedores() {
        return developerRepository.findAll();
    }

    @PostMapping
    public Developer criarDesenvolvedor(@RequestBody Developer developer) {
        return developerRepository.save(developer);
    }
}
