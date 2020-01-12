package com.github.fredriksa.StationService.repositories;

import com.github.fredriksa.StationService.models.Station;
import org.springframework.data.repository.CrudRepository;

public interface StationRepository extends CrudRepository<Station, Long> {
    Station findById(long id);
    Station findByName(String name);
}
