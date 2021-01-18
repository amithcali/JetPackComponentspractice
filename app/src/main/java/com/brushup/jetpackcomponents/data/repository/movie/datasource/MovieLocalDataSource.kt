package com.brushup.jetpackcomponents.data.repository.movie.datasource

import com.brushup.jetpackcomponents.model.movie.Movie


interface MovieLocalDataSource {
  suspend fun getMoviesFromDB():List<Movie>
  suspend fun saveMoviesToDB(movies:List<Movie>)
  suspend fun clearAll()
}