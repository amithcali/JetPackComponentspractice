package com.brushup.jetpackcomponents.data.repository.movie.datasource

import com.brushup.jetpackcomponents.model.movie.Movie


interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}