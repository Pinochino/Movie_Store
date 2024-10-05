package com.example.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Movie")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID movieID;

    @Column(name = "movieName")
    @NotBlank(message = "Please enter the movie's name")
    String  movieName;

    @Column(name = "trailer")
    @NotBlank(message = "Please enter the movie's trailer")
    String trailer;

    @Column(name = "poster")
    @Lob
    File poster;

    @Column(name = "releaseDate")
    @NotBlank(message = "Please enter the movie's releaseDate")
    Date releaseDate;

    @Column(name = "filmDescription")
    @NotBlank(message = "Please enter the movie's filmDescription")
    String filmDescription;

    @Column(name = "movieName")
    @NotBlank(message = "Please enter the movie's name")
    String nation;

    @Column(name = "movieName")
    @NotBlank(message = "Please enter the movie's name")
    String genre;

    @Column(name = "movieName")
    @NotBlank(message = "Please enter the movie's name")
    Integer duration;

    @Column(name = "movieName")
    @NotBlank(message = "Please enter the movie's name")
    String actor;

    @Column(name = "movieName")
    @NotBlank(message = "Please enter the movie's name")
    String director;

    @Column(name = "movieName")
    @NotBlank(message = "Please enter the movie's name")
    String movieStatus;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Showtime> showtimesList;
}
