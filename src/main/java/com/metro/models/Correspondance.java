package com.metro.models;

import lombok.Getter;

import java.util.List;

@Getter
public class Correspondance extends Station {

    private List<Ligne> lignes;

    public Correspondance(String name, String description, int position, List<Ligne> lignes) {
        super(name, description, position);
        this.lignes = lignes;
    }

}
