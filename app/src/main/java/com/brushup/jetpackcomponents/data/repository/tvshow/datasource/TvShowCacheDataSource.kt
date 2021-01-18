package com.brushup.jetpackcomponents.data.repository.tvshow.datasource

import com.brushup.jetpackcomponents.model.tvshow.TvShow


interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)

}