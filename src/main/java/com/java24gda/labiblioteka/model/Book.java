package com.java24gda.labiblioteka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;
    private int yearWriten;

    @Formula(value = "year(now()) - year_written")
    private Integer howOld;

    private int numberOfCopies;

    @OneToMany
    private PublishingHouse publishingHouse;

}
