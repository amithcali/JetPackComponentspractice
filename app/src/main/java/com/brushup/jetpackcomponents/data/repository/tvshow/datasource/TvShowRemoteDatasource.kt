package com.brushup.jetpackcomponents.data.repository.tvshow.datasource


import com.brushup.jetpackcomponents.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}