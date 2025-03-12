package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "title")
@Data
public class entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String title;
    @Column(length = 99999)
    private String description;
    private String url;
    private LocalDateTime publishedAt;


}
