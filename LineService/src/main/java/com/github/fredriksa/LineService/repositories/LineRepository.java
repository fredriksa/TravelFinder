package com.github.fredriksa.LineService.repositories;

import com.github.fredriksa.LineService.models.Line;
import org.springframework.data.repository.CrudRepository;

public interface LineRepository extends CrudRepository<Line, Long> {
    Line findById(long id);
}
