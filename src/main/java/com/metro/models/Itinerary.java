package com.metro.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Itinerary {
    Station start;
    Station arrival;
    List<Station> stations;
}

