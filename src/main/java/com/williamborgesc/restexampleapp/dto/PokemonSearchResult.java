package com.williamborgesc.restexampleapp.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PokemonSearchResult {

    private Integer count;
    
    @JsonProperty("results")
    private List<Pokemon> pokemons;
}
