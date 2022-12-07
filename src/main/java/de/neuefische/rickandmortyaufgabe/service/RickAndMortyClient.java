package de.neuefische.rickandmortyaufgabe.service;

import de.neuefische.rickandmortyaufgabe.model.Character;
import de.neuefische.rickandmortyaufgabe.repo.CharacterRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickAndMortyClient {

    public CharacterRepo characterRepo;

    public List<Character> allCharacters() {
        return characterRepo.allCharacters();
    }



        public List<Character> allCharactersAlive() {
            return characterRepo.allCharactersAlive();
        }


        //Client
        WebClient webClient = WebClient.create("https://rickandmortyapi.com");


        public CharacterRepo getAllCharacters (String status) {

            String allCharacters;

            if (status == null) {
                allCharacters = "/api/character";
            } else {
                allCharacters = "/api/character/?status=alive";
            }

            CharacterRepo characters = webClient.get()
                    .uri(allCharacters)
                    .header("Authorization", "Bearer lkjasdflkj")
                    .retrieve()
                    .toEntity(CharacterRepo.class)
                    .block()
                    .getBody();

            return characters;

        }

        public CharacterRepo getAllCharactersAlive () {
            CharacterRepo aliveCharacters = webClient.get()
                    .uri("/api/character/?status=alive")
                    .header("Authorization", "Bearer lkjasdflkj")
                    .retrieve()
                    .toEntity(CharacterRepo.class)
                    .block()
                    .getBody();

            return aliveCharacters;
        }

    }
