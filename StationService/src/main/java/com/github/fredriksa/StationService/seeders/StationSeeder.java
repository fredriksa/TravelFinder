package com.github.fredriksa.StationService.seeders;

import com.github.fredriksa.StationService.models.Station;
import com.github.fredriksa.StationService.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StationSeeder {

    private boolean shouldSeed = true;

    @Autowired
    private final StationRepository stationRepository = null;

    @EventListener
    public void onApplicationReady(ApplicationReadyEvent event) {
        if (!shouldSeed) return;

        stationRepository.deleteAll();
        stationRepository.save(new Station(1, "Train Station North", 500, 1000));
        stationRepository.save(new Station(2, "Train Station South", 500,200));
        stationRepository.save(new Station(3, "West", 0, 800));
        stationRepository.save(new Station(4, "2", 200, 800));
        stationRepository.save(new Station(5, "1", 200, 600));
        stationRepository.save(new Station(6, "5", 0, 400));
        stationRepository.save(new Station(7, "4", 200, 400));
        stationRepository.save(new Station(8, "Q", 200, 200));
        stationRepository.save(new Station(9, "P", 200, 100));
        stationRepository.save(new Station(10, "O", 200, 0));
        stationRepository.save(new Station(11, "N", 300, 0));
        stationRepository.save(new Station(12, "H", 500, 0));
        stationRepository.save(new Station(13, "M", 800, 0));
        stationRepository.save(new Station(14, "C", 900, 0));
        stationRepository.save(new Station(15, "K", 1000, 0));
        stationRepository.save(new Station(16, "J", 1000, 100));
        stationRepository.save(new Station(17, "E", 1000, 200));
        stationRepository.save(new Station(18, "D", 700, 200));
        stationRepository.save(new Station(19, "C", 500, 400));
        stationRepository.save(new Station(20, "B", 500, 600));
        stationRepository.save(new Station(21, "A", 500, 800));
        stationRepository.save(new Station(22, "F", 700, 600));
        stationRepository.save(new Station(23, "G", 1000, 600));
    }
}
