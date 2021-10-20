package com.example.demo.repository;

import com.example.demo.domain.SectionToPerson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionToPersonRepository extends CrudRepository<SectionToPerson, Integer> {
}
