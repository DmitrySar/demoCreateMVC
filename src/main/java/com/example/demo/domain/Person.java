package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@NoArgsConstructor
@Data
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String lastname;
    private String name;
    private String surname;
    private Date birthday;
}
