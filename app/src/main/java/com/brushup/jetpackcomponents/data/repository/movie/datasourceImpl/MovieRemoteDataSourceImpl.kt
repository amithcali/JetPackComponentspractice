package com.brushup.jetpackcomponents.data.repository.movie.datasourceImpl


import com.brushup.jetpackcomponents.data.api.TMDBService
import com.brushup.jetpackcomponents.data.repository.movie.datasource.MovieRemoteDatasource
import com.brushup.jetpackcomponents.model.movie.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)
}

