package com.brushup.jetpackcomponents.domain.repository

import com.brushup.jetpackcomponents.model.movie.Movie


interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?

}