package com.github.fredriksa.LineService.models;

import com.github.fredriksa.LineService.LineServiceApplication;
import com.github.fredriksa.LineService.core.TravelType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import javax.persistence.*;

@Entity
public class Line {

    @Id
    private long id;

    @Column(name="NAME")
    private String name;

    @Enumerated(EnumType.ORDINAL)
    private TravelType type;

    @Column(name="STARTSTATION_ID")
    private int startStationId;

    @Column(name="ENDSTATION_ID")
    private int endStationId;

    @Transient
    @Autowired
    private RestTemplate restTemplate;

    public Line() { }

    public Line(int id, TravelType type, int startStationId, int endStationId) {
        this.id = id;
        this.type = type;
        this.startStationId = startStationId;
        this.endStationId = endStationId;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStartStationId() {
        return startStationId;
    }

    public void setStartStationId(int startStationId) {
        this.startStationId = startStationId;
    }

    public int getEndStationId() {
        return endStationId;
    }

    public void setEndStationId(int endStationId) {
        this.endStationId = endStationId;
    }
}