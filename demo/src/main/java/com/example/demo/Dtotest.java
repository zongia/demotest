package com.example.demo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Dtotest {

        private String title;
        private String description;
        private String url;
        private LocalDateTime PublishedAt;


}
