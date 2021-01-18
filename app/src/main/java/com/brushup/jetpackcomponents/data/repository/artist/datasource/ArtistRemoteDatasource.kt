package com.brushup.jetpackcomponents.data.repository.artist.datasource


import com.brushup.jetpackcomponents.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}