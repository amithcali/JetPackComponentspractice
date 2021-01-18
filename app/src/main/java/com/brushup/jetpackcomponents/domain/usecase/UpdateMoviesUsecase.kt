package com.brushup.jetpackcomponents.domain.usecase

import com.brushup.jetpackcomponents.domain.repository.MovieRepository
import com.brushup.jetpackcomponents.model.movie.Movie


class UpdateMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}