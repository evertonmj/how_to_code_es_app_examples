
package com.fintechinnovations.controllers;

import com.fintechinnovations.models.Investimento;
import com.fintechinnovations.repositories.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    @Autowired
    private InvestimentoRepository investimentoRepository;

    @GetMapping
    public List<Investimento> listarTodosInvestimentos() {
        return investimentoRepository.findAll();
    }

    @PostMapping
    public Investimento criarInvestimento(@RequestBody Investimento investimento) {
        return investimentoRepository.save(investimento);
    }
}
