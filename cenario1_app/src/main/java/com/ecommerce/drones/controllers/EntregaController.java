
package com.ecommerce.drones.controllers;

import com.ecommerce.drones.models.Entrega;
import com.ecommerce.drones.repositories.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entregas")
public class EntregaController {

    @Autowired
    private EntregaRepository entregaRepository;

    @GetMapping
    public List<Entrega> listarTodasEntregas() {
        return entregaRepository.findAll();
    }

    @PostMapping
    public Entrega criarEntrega(@RequestBody Entrega entrega) {
        return entregaRepository.save(entrega);
    }
}
