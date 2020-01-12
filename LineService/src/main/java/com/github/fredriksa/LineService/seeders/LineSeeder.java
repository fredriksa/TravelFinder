package com.github.fredriksa.LineService.seeders;

import com.github.fredriksa.LineService.core.TravelType;
import com.github.fredriksa.LineService.models.Line;
import com.github.fredriksa.LineService.repositories.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class LineSeeder {

    private boolean shouldSeed = true;

    @Autowired
    private final LineRepository lineRepository = null;

    @EventListener
    public void onApplicationReady(ApplicationReadyEvent event) {
        if (!shouldSeed) return;

        lineRepository.deleteAll();
        lineRepository.save(new Line(30, TravelType.TRAIN, 1, 1));
        lineRepository.save(new Line(31, TravelType.TRAIN, 1, 1));
        lineRepository.save(new Line(710, TravelType.BUSS, 1, 1));
        lineRepository.save(new Line(710, TravelType.BUSS, 1, 2));
        lineRepository.save(new Line(710, TravelType.BUSS, 1, 1));
    }
}
