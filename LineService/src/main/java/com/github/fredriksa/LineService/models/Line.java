package com.github.fredriksa.LineService.models;

import com.github.fredriksa.LineService.core.TravelType;

public class Line {
    private int id;
    private TravelType type;
    private String name;

    public Line(int id, TravelType type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    public TravelType getType() {
        return type;
    }

    public void setType(TravelType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}