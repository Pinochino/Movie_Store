package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Entity
@Table(name = "Showtime")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Showtime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID showTimeId;


}
