package com.github.fredriksa.TravelService.models;

import com.github.fredriksa.TravelService.core.TravelType;

public class Line {
    private TravelType type;
    private String name;

    public Line(TravelType type, String name) {
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
}
