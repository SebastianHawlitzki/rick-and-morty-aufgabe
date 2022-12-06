package de.neuefische.rickandmortyaufgabe.repo;

import de.neuefische.rickandmortyaufgabe.model.Character;
import de.neuefische.rickandmortyaufgabe.model.Info;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterRepo {

    private Info info;

    private List<Character> results = new ArrayList<>();


    //get all characters
    public List<Character> allCharacters(){
        return this.results;
    }

}
