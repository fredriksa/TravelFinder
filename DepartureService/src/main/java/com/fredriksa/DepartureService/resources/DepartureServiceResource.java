package com.fredriksa.DepartureService.resources;

import com.fredriksa.DepartureService.models.Departure;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/departure")
public class DepartureServiceResource {

    @RequestMapping("/all/{stationId}")
    List<Departure> getDepartures(@PathVariable("stationId") String stationId) {

        Random random = new Random();
        List<Departure> departures = new ArrayList<>();

        final int DEPARTURE_COUNT = random.nextInt(50) + 5;
        for (int i = 0; i < DEPARTURE_COUNT; i++) {
            departures.add(
              new Departure(i+1, LocalDateTime.of(2020, 01, 11, random.nextInt(23), random.nextInt(59)), random.nextInt(900), i+1)
            );
        }

        departures.sort((one, two) -> one.getDepartureTime().compareTo(two.getDepartureTime()));
        return departures;
    }
}
