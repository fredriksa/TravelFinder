package com.github.fredriksa.LineService.core;

import com.github.fredriksa.LineService.models.Station;
import org.springframework.web.client.RestTemplate;

public class LineNameGenerator {

    private RestTemplate restTemplate;

    public LineNameGenerator(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String generate(TravelType type, long id, int endStationId) {
        StringBuilder builder = new StringBuilder();
        String typeName = type.toString().substring(0,1).toUpperCase() + type.toString().substring(1).toLowerCase();

        Station endStation = restTemplate.getForObject("http://station-service/station/" + endStationId, Station.class);
        builder.append(typeName)
                .append(" ")
                .append(id)
                .append(" towards ")
                .append(endStation.getName());

        return builder.toString();
    }
}
