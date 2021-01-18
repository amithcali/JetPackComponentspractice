package com.brushup.jetpackcomponents.data.repository.artist.datasource

import com.brushup.jetpackcomponents.model.artist.Artist


interface ArtistLocalDataSource {
  suspend fun getArtistsFromDB():List<Artist>
  suspend fun saveArtistsToDB(artists:List<Artist>)
  suspend fun clearAll()
}