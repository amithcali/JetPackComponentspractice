package com.brushup.jetpackcomponents.data.repository.artist.datasourceImpl


import com.brushup.jetpackcomponents.data.api.TMDBService
import com.brushup.jetpackcomponents.data.repository.artist.datasource.ArtistRemoteDatasource
import com.brushup.jetpackcomponents.model.artist.ArtistList
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

