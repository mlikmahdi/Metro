package com.metro.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Station {

    protected String name;
    protected String description;
    protected int position;
}
