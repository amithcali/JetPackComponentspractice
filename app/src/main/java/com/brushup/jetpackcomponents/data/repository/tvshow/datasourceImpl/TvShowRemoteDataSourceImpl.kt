package com.brushup.jetpackcomponents.data.repository.tvshow.datasourceImpl


import com.brushup.jetpackcomponents.data.api.TMDBService
import com.brushup.jetpackcomponents.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.brushup.jetpackcomponents.model.tvshow.TvShowList
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

