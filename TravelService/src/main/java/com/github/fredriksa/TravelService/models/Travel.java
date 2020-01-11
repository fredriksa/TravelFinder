package com.github.fredriksa.TravelService.models;

import com.github.fredriksa.TravelService.core.TravelType;

import java.util.List;
import java.util.Set;

public class Travel {
    private Path overviewPath;
    private Set<TravelType> travelTypes;
    private List<Path> paths;

    public Travel(Path overviewPath, Set<TravelType> travelTypes, List<Path> paths) {
        this.overviewPath = overviewPath;
        this.travelTypes = travelTypes;
        this.paths = paths;
    }

    public Path getOverviewPath() {
        return overviewPath;
    }

    public void setOverviewPath(Path overviewPath) {
        this.overviewPath = overviewPath;
    }

    public Set<TravelType> getTravelTypes() {
        return travelTypes;
    }

    public void setTravelTypes(Set<TravelType> travelTypes) {
        this.travelTypes = travelTypes;
    }

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }
}
