
package com.payments.controllers;

import com.payments.models.Payment;
import com.payments.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping
    public List<Payment> listarTodosPagamentos() {
        return paymentRepository.findAll();
    }

    @PostMapping
    public Payment processarPagamento(@RequestBody Payment payment) {
        // Aqui, normalmente, o processamento do pagamento seria feito por uma API de pagamento de terceiros.
        return paymentRepository.save(payment);
    }
}
