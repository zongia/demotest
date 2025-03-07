package com.example.demo;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    @Autowired
    Repos repos;
    public  void convert(DtoTest2 dtoTest2)
    {
        if (dtoTest2.getTotalResults()==0){}
        else
        {
            entity entitys=new entity();
            entitys.setPublishedAt(dtoTest2.getArticles().get(0).getPublishedAt());
            entitys.setDescription(dtoTest2.getArticles().get(0).getDescription());
            entitys.setTitle(dtoTest2.getArticles().get(0).getTitle());
            entitys.setUrl(dtoTest2.getArticles().get(0).getUrl());
            repos.save(entitys);

        }
    }
}
