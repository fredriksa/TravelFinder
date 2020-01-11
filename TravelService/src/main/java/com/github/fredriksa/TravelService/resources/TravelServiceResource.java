package com.github.fredriksa.TravelService.resources;

import com.github.fredriksa.TravelService.core.TravelType;
import com.github.fredriksa.TravelService.models.Line;
import com.github.fredriksa.TravelService.models.Path;
import com.github.fredriksa.TravelService.models.Travel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/travel")
public class TravelServiceResource {

    @RequestMapping("/{from}:{to}")
    public Travel getTravel(@PathVariable("from") String from, @PathVariable("to") String to) {
        List paths = Arrays.asList(
                new Path("13:37", from, "13:54", "Station B", new Line(TravelType.BUSS, "555 towards Jakobsberg")),
                new Path("13:56", "Station B", "14:03", "Station C", new Line(TravelType.BUSS, "721 towards Fiskvagen")),
                new Path("14:08", "Station C", "14:21", "Station D", new Line(TravelType.TRAIN, "81 towards Umea")),
                new Path("14:30", "Station D", "14:39", to, new Line(TravelType.BUSS, "871 towards " + to))
        );

        return new Travel(
            new Path("13:37", from, "14:39", to, null),
            Set.of(TravelType.BUSS, TravelType.TRAIN),
            paths
        );
    }
}
