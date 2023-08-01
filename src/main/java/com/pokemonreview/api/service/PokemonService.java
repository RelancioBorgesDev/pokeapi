package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.PokemonDTO;
import com.pokemonreview.api.dto.PokemonResponse;


public interface PokemonService {
    PokemonDTO createPokemon(PokemonDTO pokemonDTO);
    PokemonResponse getAllPokemons(int pageNumber, int pageSize);
    PokemonDTO getPokemonById (int id);
    PokemonDTO updatePokemon(PokemonDTO pokemonDTO, int id);
    public void deletePokemon(int id);
}
