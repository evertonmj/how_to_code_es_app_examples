
package com.fintechinnovations.controllers;

import com.fintechinnovations.models.Transferencia;
import com.fintechinnovations.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    @GetMapping
    public List<Transferencia> listarTodasTransferencias() {
        return transferenciaRepository.findAll();
    }

    @PostMapping
    public Transferencia criarTransferencia(@RequestBody Transferencia transferencia) {
        return transferenciaRepository.save(transferencia);
    }
}
