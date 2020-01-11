package com.fredriksa.DepartureService.models;

import java.time.LocalDateTime;

public class Departure {
    private int id;
    private LocalDateTime departureTime;

    private int fromStationId;
    private int lineId;

    public Departure(int id, LocalDateTime departureTime, int lineId, int fromStationId) {
        this.id = id;
        this.departureTime = departureTime;
        this.lineId = lineId;
        this.fromStationId = fromStationId;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromStationId() {
        return fromStationId;
    }

    public void setFromStationId(int fromStationId) {
        this.fromStationId = fromStationId;
    }
}
