package com.example.demo.Dto;

import lombok.Data;

import java.util.List;

@Data
public class DtoTest2 {

    private String status;


    private int totalResults;


    private List<Dtotest> articles;
}
