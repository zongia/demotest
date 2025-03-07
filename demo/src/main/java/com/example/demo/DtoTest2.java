package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DtoTest2 {

    private String status;


    private int totalResults;


    private List<Dtotest> articles;
}
