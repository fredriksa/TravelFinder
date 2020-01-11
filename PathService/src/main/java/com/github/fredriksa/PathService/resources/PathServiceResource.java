package com.github.fredriksa.PathService.resources;

import com.github.fredriksa.PathService.models.Path;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/path")
public class PathServiceResource {

    @RequestMapping("/{fromStationId}:{toStationId}")
    List<Path> getPath(@PathVariable("fromStationId") String fromStationId, @PathVariable("toStationId") String toStationId) {
        return Arrays.asList(
          new Path("13:37", fromStationId, "13:54", "Station B", 1),
          new Path("13:56", "Station B", "14:03", "Station C", 2),
          new Path("14:08", "Station C", "14:21", "Station D", 3),
          new Path("14:30", "Station D", "14:39", toStationId, 4)
        );
    }
}
