package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.File;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Movie")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID movieID;

    String  movieName;

    @Lob
    File poster;

    Date releaseDate;

    String filmDescription;

    String nation;

    String genre;

    Integer duration;

    String actor;

    String director;

    String movieStatus;
    
}
