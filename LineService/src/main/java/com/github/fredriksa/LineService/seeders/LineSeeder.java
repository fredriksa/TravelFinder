package com.github.fredriksa.LineService.seeders;

import com.github.fredriksa.LineService.core.LineNameGenerator;
import com.github.fredriksa.LineService.core.TravelType;
import com.github.fredriksa.LineService.models.Line;
import com.github.fredriksa.LineService.repositories.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class LineSeeder {

    private boolean shouldSeed = true;

    @Autowired
    private final LineRepository lineRepository = null;

    @Autowired
    private final RestTemplate restTemplate = null;

    @EventListener
    public void onApplicationReady(ApplicationReadyEvent event) {
        if (!shouldSeed) return;

        lineRepository.deleteAll();

        List<Line> lines = List.of (
            new Line(30, TravelType.TRAIN, 1, 1),
            new Line(31, TravelType.TRAIN, 1, 1),
            new Line(710, TravelType.BUSS, 1, 1),
            new Line(710, TravelType.BUSS, 1, 2),
            new Line(710, TravelType.BUSS, 1, 1)
        );

        LineNameGenerator nameGen = new LineNameGenerator(restTemplate);

        lines.forEach((line) -> line.setName(nameGen.generate(
            line.getType(),
            line.getId(),
            line.getEndStationId()
        )));

        lines.forEach((line) -> lineRepository.save(line));
    }
}
