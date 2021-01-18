package com.brushup.jetpackcomponents.data.repository.tvshow.datasource

import com.brushup.jetpackcomponents.model.tvshow.TvShow


interface TvShowLocalDataSource {
  suspend fun getTvShowsFromDB():List<TvShow>
  suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
  suspend fun clearAll()
}