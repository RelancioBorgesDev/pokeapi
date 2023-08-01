package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.ReviewDTO;

import java.util.List;

public interface ReviewService {
    public ReviewDTO createReview(int pokemonId, ReviewDTO reviewDto);
    public List<ReviewDTO> getReviewsByPokemonId(int id);
    public ReviewDTO getReviewById(int reviewId, int pokemonId);
    public ReviewDTO updateReview(int pokemonId, int reviewId, ReviewDTO reviewDto);
    public void deleteReview(int pokemonId, int reviewId);
}
