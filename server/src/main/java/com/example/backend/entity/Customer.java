package com.example.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "Customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID customerId;

    String fullName;

    @Email
    String email;

    String password;


}
