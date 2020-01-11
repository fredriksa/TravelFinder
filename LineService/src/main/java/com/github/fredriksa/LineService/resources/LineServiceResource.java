package com.github.fredriksa.LineService.resources;

import com.github.fredriksa.LineService.core.TravelType;
import com.github.fredriksa.LineService.models.Line;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/line")
public class LineServiceResource {

    @RequestMapping("/{lineId}")
    public Line getLine(@PathVariable("lineId") String lineId) {
        Random random = new Random();
        String lineName = random.nextInt(900) + " towards Stockholm";

        return new Line(
            Integer.parseInt(lineId),
            TravelType.BUSS,
            lineName
        );
    }
}
