
package com.softwarefactory.controllers;

import com.softwarefactory.models.Task;
import com.softwarefactory.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> listarTodasTarefas() {
        return taskRepository.findAll();
    }

    @PostMapping
    public Task criarTarefa(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}
