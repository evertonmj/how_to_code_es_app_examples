
package com.fintechinnovations.controllers;

import com.fintechinnovations.models.Pagamento;
import com.fintechinnovations.repositories.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping
    public List<Pagamento> listarTodosPagamentos() {
        return pagamentoRepository.findAll();
    }

    @PostMapping
    public Pagamento criarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
}
