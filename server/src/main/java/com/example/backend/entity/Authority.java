package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Entity
@Table(name = "Authority")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID authorityId;

    @Column(name = "authoriryName")
    String authorityName;

}
