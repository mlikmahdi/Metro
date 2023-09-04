package com.metro.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Ligne {

    private String name;

    private List<Station> stations;
}
