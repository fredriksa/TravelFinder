package com.github.fredriksa.LineService.repositories;

import com.github.fredriksa.LineService.models.Line;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LineRepository extends CrudRepository<Line, Long> {
    Line findById(long id);
}
