package com.pokemonreview.api.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ReviewDTO {
    private int id;
    private String title;
    private String content;
    private int stars;
}