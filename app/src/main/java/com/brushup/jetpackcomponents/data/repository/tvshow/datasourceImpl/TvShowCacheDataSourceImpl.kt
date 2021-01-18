package com.brushup.jetpackcomponents.data.repository.tvshow.datasourceImpl

import com.brushup.jetpackcomponents.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.brushup.jetpackcomponents.model.tvshow.TvShow


class TvShowCacheDataSourceImpl :
    TvShowCacheDataSource {
    private var tvShowList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
       tvShowList.clear()
       tvShowList = ArrayList(tvShows)
    }
}