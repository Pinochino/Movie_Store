package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Entity
@Table(name = "Voucher")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Voucher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID voucherId;

}
