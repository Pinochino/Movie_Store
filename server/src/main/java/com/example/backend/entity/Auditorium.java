package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Entity
@Table(name = "Auditorium")
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Auditorium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID auditoriumId;


}
