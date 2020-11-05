package com.williamborgesc.restexampleapp.dto;

import com.williamborgesc.restexampleapp.service.PokemonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    private PokemonService pokemonService;

    @GetMapping
    public Pokemon getRandom(){

        return pokemonService.getRandom();
    }
}
