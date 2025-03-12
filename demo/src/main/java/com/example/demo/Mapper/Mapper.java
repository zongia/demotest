package com.example.demo.Mapper;

import com.example.demo.Dto.DtoTest2;
import com.example.demo.Entity.entity;

import javax.swing.text.html.parser.Entity;

public class Mapper {
    public entity convert(DtoTest2 dtoTest2)
    {
        if (dtoTest2.getTotalResults()==0){}
        else
        {
            entity entitys=new entity();
            entitys.setPublishedAt(dtoTest2.getArticles().get(0).getPublishedAt());
            entitys.setDescription(dtoTest2.getArticles().get(0).getDescription());
            entitys.setTitle(dtoTest2.getArticles().get(0).getTitle());
            entitys.setUrl(dtoTest2.getArticles().get(0).getUrl());
            return entitys;

        }


    }
}
