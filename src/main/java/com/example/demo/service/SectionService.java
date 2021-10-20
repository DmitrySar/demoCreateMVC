package com.example.demo.service;

import com.example.demo.domain.Section;
import com.example.demo.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionService {

    final
    SectionRepository sectionRepository;

    @Autowired
    public SectionService(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    public Section findById(int id) {
        return sectionRepository.findById(id).orElse(new Section());
    }

    public Iterable<Section> findAll() {
        return sectionRepository.findAll();
    }

    public Section save(Section section) {
        return sectionRepository.save(section);
    }

    public void delete(Section section) {
        sectionRepository.delete(section);
    }
}
