package com.github.fredriksa.StationService.resources;

import com.github.fredriksa.StationService.models.Station;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/station")
public class StationServiceResource {

    @RequestMapping("/{stationId}")
    public Station getStation(@PathVariable("stationId") String id) {
        Random random = new Random();
        return new Station(
                Integer.parseInt(id),
                "Station " + id,
                random.nextDouble() * 50,
                random.nextDouble() * 50
        );
    }

    @RequestMapping("/all")
    public List<Station> getStations() {
        return Arrays.asList(
            new Station(1, "Station A", 50, 50),
            new Station(2, "Station B", 50, 50),
            new Station(3, "Station C", 50, 50),
            new Station(4, "Station D", 50, 50)
        );
    }

    @RequestMapping("/exists/{stationName}")
    public boolean getExists(@PathVariable("stationName") String stationName) {
        return true;
    }
}
