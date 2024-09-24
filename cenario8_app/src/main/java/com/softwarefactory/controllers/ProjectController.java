
package com.softwarefactory.controllers;

import com.softwarefactory.models.Project;
import com.softwarefactory.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> listarTodosProjetos() {
        return projectRepository.findAll();
    }

    @PostMapping
    public Project criarProjeto(@RequestBody Project project) {
        return projectRepository.save(project);
    }
}
