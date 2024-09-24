
package com.ecommercesolutions.controllers;

import com.ecommercesolutions.models.Customer;
import com.ecommercesolutions.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> listarTodosClientes() {
        return customerRepository.findAll();
    }

    @PostMapping
    public Customer criarCliente(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
}
