package com.brushup.jetpackcomponents.data.repository.artist.datasource

import com.brushup.jetpackcomponents.model.artist.Artist


interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)

}