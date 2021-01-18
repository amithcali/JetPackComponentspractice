package com.brushup.jetpackcomponents.data.repository.movie.datasource


import com.brushup.jetpackcomponents.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}