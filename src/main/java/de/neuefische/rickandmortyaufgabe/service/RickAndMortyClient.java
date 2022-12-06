package de.neuefische.rickandmortyaufgabe.service;

import de.neuefische.rickandmortyaufgabe.model.Character;
import de.neuefische.rickandmortyaufgabe.repo.CharacterRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickAndMortyClient {

    public CharacterRepo characterRepo;

    public List<Character> allCharacters() {
        return characterRepo.allCharacters();
    }

        //Client
        WebClient webClient = WebClient.create("https://rickandmortyapi.com");


        public CharacterRepo getAllCharacters () {
            CharacterRepo characters = webClient.get()
                    .uri("/api/character")
                    .header("Authorization", "Bearer lkjasdflkj")
                    .retrieve()
                    .toEntity(CharacterRepo.class)
                    .block()
                    .getBody();

            return characters;
        }

    }
