package de.neuefische.rickandmortyaufgabe.controller;

import de.neuefische.rickandmortyaufgabe.repo.CharacterRepo;
import de.neuefische.rickandmortyaufgabe.service.RickAndMortyClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/character")
@RequiredArgsConstructor
public class RickAndMortyController {

    private final RickAndMortyClient rickAndMortyClient;



    @GetMapping()
    public CharacterRepo resultsAlive(@RequestParam(required = false) String status) {
        return rickAndMortyClient.getAllCharacters(status);

    }


}
