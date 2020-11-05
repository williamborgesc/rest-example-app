package com.williamborgesc.restexampleapp.service;

import com.williamborgesc.restexampleapp.dto.Pokemon;
import com.williamborgesc.restexampleapp.dto.PokemonSearchResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
@AllArgsConstructor
public class PokemonService {

    private final String ALL_URI = "https://pokeapi.co/api/v2/pokemon/?offset=0&limit=1050";

    private RestTemplate restTemplate;

    public Pokemon getRandom() {
        PokemonSearchResult result = restTemplate.getForObject(ALL_URI, PokemonSearchResult.class);
        return result.getPokemons().get(new Random().nextInt(result.getCount()));
    }

}
