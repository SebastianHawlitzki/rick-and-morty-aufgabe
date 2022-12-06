package de.neuefische.rickandmortyaufgabe.controller;

import de.neuefische.rickandmortyaufgabe.repo.CharacterRepo;
import de.neuefische.rickandmortyaufgabe.service.RickAndMortyClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/character")
@RequiredArgsConstructor
public class RickAndMortyController {

    private final RickAndMortyClient rickAndMortyClient;

    @GetMapping
    public CharacterRepo results (){
        return rickAndMortyClient.getAllCharacters();
    }
}
