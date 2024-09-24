
package com.onlinegame.controllers;

import com.onlinegame.models.Competition;
import com.onlinegame.repositories.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/competitions")
public class CompetitionController {

    @Autowired
    private CompetitionRepository competitionRepository;

    @GetMapping
    public List<Competition> listarTodasCompeticoes() {
        return competitionRepository.findAll();
    }

    @PostMapping
    public Competition criarCompeticao(@RequestBody Competition competition) {
        return competitionRepository.save(competition);
    }
}
