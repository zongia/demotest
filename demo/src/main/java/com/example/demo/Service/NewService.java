package com.example.demo.Service;

import com.example.demo.Dto.DtoTest2;
import com.example.demo.Entity.entity;
import com.example.demo.Mapper.Mapper;
import com.example.demo.Repos.Repos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class NewService {
    private final WebClient webClient;
    @Autowired
    Repos repos;
    @Autowired
    Mapper mapper;
    private static String apiKey="ed7333c1408e4daabae3f03a527410c4";

    public NewService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://newsapi.org/v2").build();
    }

    public Mono<DtoTest2> getTopHeadlines(String country) {

        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/top-headlines")
                        .queryParam("country", country)

                        .queryParam("apiKey", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(DtoTest2.class);
    }
    public void save(DtoTest2 dtoTest2)
    {
        if (dtoTest2.getTotalResults()==0){}
        else
        {

            repos.save(mapper.convert(dtoTest2));

        }

    }
}