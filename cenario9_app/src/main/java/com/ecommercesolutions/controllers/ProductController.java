
package com.ecommercesolutions.controllers;

import com.ecommercesolutions.models.Product;
import com.ecommercesolutions.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> listarTodosProdutos() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product criarProduto(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
