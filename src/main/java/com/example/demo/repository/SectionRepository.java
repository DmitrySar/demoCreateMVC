package com.example.demo.repository;

import com.example.demo.domain.Section;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends CrudRepository<Section, Integer> {
}
