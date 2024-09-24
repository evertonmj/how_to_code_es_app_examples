
package com.onlinegame.controllers;

import com.onlinegame.models.User;
import com.onlinegame.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> listarTodosUsuarios() {
        return userRepository.findAll();
    }

    @PostMapping
    public User criarUsuario(@RequestBody User user) {
        return userRepository.save(user);
    }
}
