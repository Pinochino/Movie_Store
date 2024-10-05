package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Entity
@Table(name = "Comment")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID commentId;



}
