
package com.cryptoexchange.controllers;

import com.cryptoexchange.models.Transaction;
import com.cryptoexchange.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping
    public List<Transaction> listarTodasTransacoes() {
        return transactionRepository.findAll();
    }

    @PostMapping
    public Transaction criarTransacao(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
