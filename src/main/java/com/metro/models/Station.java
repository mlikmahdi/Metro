package com.metro.models;

import lombok.Getter;

@Getter

public class Station {

    private int id;
    private String name;
    private String description;

    public Station(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
