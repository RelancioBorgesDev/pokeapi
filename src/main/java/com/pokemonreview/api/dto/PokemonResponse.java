package com.pokemonreview.api.dto;

import com.pokemonreview.api.models.Pokemon;
import lombok.Data;

import java.util.List;
@Data
public class PokemonResponse {
    private List<PokemonDTO> data;
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean last;

}
