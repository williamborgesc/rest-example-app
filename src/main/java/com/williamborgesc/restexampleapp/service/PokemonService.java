package com.williamborgesc.restexampleapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.williamborgesc.restexampleapp.dto.Pokemon;
import com.williamborgesc.restexampleapp.dto.PokemonSearchResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

@Service
@AllArgsConstructor
public class PokemonService {

    public Pokemon getRandom() throws IOException {
        PokemonSearchResult result = loadPokemonSearch();
        return result.getPokemons().get(new Random().nextInt(result.getCount()));
    }

    private PokemonSearchResult loadPokemonSearch() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = this.getClass().getResourceAsStream("/pokemons.json");

        return objectMapper.readValue(inputStream, PokemonSearchResult.class);

    }

}
