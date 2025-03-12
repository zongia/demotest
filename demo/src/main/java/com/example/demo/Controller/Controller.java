package com.example.demo.Controller;

import com.example.demo.Dto.DtoTest2;
import com.example.demo.Dto.Dtotest;
import com.example.demo.Repos.Repos;
import com.example.demo.Service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@ResponseBody
public class Controller {
    @Autowired
    NewService newService;
    @Autowired
    Repos repos;

    @GetMapping("/test/{test}")
    public DtoTest2 asd(@PathVariable String test)
    {

        DtoTest2 dtoTest2= newService.getTopHeadlines(test).block();



        DtoTest2 dtotest1=new DtoTest2();
        dtotest1.setStatus(dtoTest2.getStatus());
        dtotest1.setTotalResults(dtoTest2.getTotalResults());


        List<Dtotest> tests=new ArrayList<>();
        if (dtoTest2.getTotalResults()>2) {
            for (int i = 0; i < 2; i++) {
                Dtotest dtotest = new Dtotest();
                dtotest.setUrl(dtoTest2.getArticles().get(i).getUrl());
                dtotest.setTitle(dtoTest2.getArticles().get(i).getTitle());
                dtotest.setDescription(dtoTest2.getArticles().get(i).getDescription());
                dtotest.setPublishedAt(dtoTest2.getArticles().get(i).getPublishedAt());
                tests.add(dtotest);
            }
        }else {dtotest1.setArticles(dtoTest2.getArticles());}
        dtotest1.setArticles(tests);

       newService.save(dtoTest2);

        return dtotest1;

    }
}
