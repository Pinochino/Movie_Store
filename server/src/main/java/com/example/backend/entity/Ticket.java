package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Entity
@Table(name = "Ticket")
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID ticketId;


}
