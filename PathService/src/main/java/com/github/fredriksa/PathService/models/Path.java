package com.github.fredriksa.PathService.models;

public class Path {
    private String departureTime;
    private String departureLocation;
    private String arrivalTime;
    private String arrivalLocation;
    private int lineId;

    public Path(String departureTime, String departureLocation, String arrivalTime, String arrivalLocation, int lineId) {
        this.departureTime = departureTime;
        this.departureLocation = departureLocation;
        this.arrivalTime = arrivalTime;
        this.arrivalLocation = arrivalLocation;
        this.lineId = lineId;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLine(int line) {
        this.lineId = line;
    }
}
