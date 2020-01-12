package com.github.fredriksa.StationService.resources;

import com.github.fredriksa.StationService.models.Station;
import com.github.fredriksa.StationService.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/station")
public class StationServiceResource {

    @Autowired
    private final StationRepository stationRepository = null;

    @RequestMapping("/{stationId}")
    public Station getStation(@PathVariable("stationId") String id) {
        if (id.isEmpty()) return null;

        return stationRepository.findById(Long.parseLong(id));
    }

    @RequestMapping("/all")
    public List<Station> getStations() {
        List<Station> stations = new ArrayList<>();
        stationRepository.findAll().forEach((station) -> stations.add(station));
        return stations;
    }

    @RequestMapping("/exists/{stationName}")
    public boolean getExists(@PathVariable("stationName") String stationName) {
        if (stationName.isEmpty()) return false;

        Station station = stationRepository.findByName(stationName);
        return station != null;
    }
}
