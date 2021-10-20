package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@Data
public class SectionToPerson {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Section section;
    @OneToOne
    private Person person;

    public SectionToPerson(Section section, Person person) {
        this.section = section;
        this.person = person;
    }

}
