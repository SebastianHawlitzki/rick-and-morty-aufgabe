package de.neuefische.rickandmortyaufgabe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Origin origin = new Origin();
    private Location location = new Location();
    private String image;
    private List<String> episode;
    private String url;
    private String created;


}
