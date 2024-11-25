package com.lolbuild.backend.controller;

import com.lolbuild.backend.model.Champion;
import com.lolbuild.backend.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/champions")
public class ChampionController {

    @Autowired
    private ChampionRepository repository;

    @GetMapping
    public List<Champion> getAllChampions() {
        return repository.findAll();
    }

    @PostMapping
    public Champion addChampion(@RequestBody Champion champion) {
        return repository.save(champion);
    }
}
