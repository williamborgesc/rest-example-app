package com.williamborgesc.restexampleapp.controller;

import com.williamborgesc.restexampleapp.dto.Pokemon;
import com.williamborgesc.restexampleapp.service.PokemonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@AllArgsConstructor
@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    private PokemonService pokemonService;

    @GetMapping
    public Pokemon getRandom() throws IOException {

        return pokemonService.getRandom();
    }
}
