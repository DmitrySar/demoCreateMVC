package com.example.demo.service;

import com.example.demo.domain.SectionToPerson;
import com.example.demo.repository.SectionToPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionToPersonService {
    final
    SectionToPersonRepository repository;

    @Autowired
    public SectionToPersonService(SectionToPersonRepository repository) {
        this.repository = repository;
    }

    public SectionToPerson addSectionToPerson(SectionToPerson sectionToPerson) {
        return repository.save(sectionToPerson);
    }

    public Iterable<SectionToPerson> findAll() {
        return repository.findAll();
    }

    public SectionToPerson findById(int id) {
        return repository.findById(id).orElse(new SectionToPerson());
    }

    public void delete(SectionToPerson sectionToPerson) {
        repository.delete(sectionToPerson);
    }

}
